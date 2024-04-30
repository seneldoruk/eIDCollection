/**
 * Copyright (c) 2014-2024 Governikus GmbH & Co. KG, Germany
 */

#include "StateCertificateDescriptionCheck.h"

#include "AppSettings.h"
#include "UrlUtil.h"
#include "asn1/Oid.h"


using namespace governikus;

Q_DECLARE_LOGGING_CATEGORY(developermode)


StateCertificateDescriptionCheck::StateCertificateDescriptionCheck(const QSharedPointer<WorkflowContext>& pContext)
	: AbstractState(pContext)
	, GenericContextContainer(pContext)
{
}


void StateCertificateDescriptionCheck::run()
{
	Q_ASSERT(getContext()->getAccessRightManager());
	Q_ASSERT(!getContext()->getDidAuthenticateEac1().isNull());
	const auto& terminalCertificate = getContext()->getAccessRightManager()->getTerminalCvc();

	if (getContext()->getDidAuthenticateEac1()->getCertificateDescriptionAsBinary().isEmpty())
	{
		qCritical() << "No certificate description available";
		updateStatus(GlobalStatus::Code::Workflow_Certificate_No_Description);
		Q_EMIT fireAbort(FailureCode::Reason::Certificate_Check_Failed_No_Description);
		return;
	}

	if (getContext()->getDidAuthenticateEac1()->getCertificateDescription()->getSubjectUrl().isEmpty())
	{
		qCritical() << "No subject url available in certificate description";
		updateStatus(GlobalStatus::Code::Workflow_Certificate_No_Url_In_Description);
		Q_EMIT fireAbort(FailureCode::Reason::Certificate_Check_Failed_No_SubjectUrl_In_Description);
		return;
	}

	QCryptographicHash hashCalculator(terminalCertificate->getBody().getHashAlgorithm());
	hashCalculator.addData(getContext()->getDidAuthenticateEac1()->getCertificateDescriptionAsBinary());

	const QByteArray& hashOfDescription = terminalCertificate->getBody().getExtension(KnownOid::ID_DESCRIPTION);
	if (hashCalculator.result() != hashOfDescription)
	{
		auto certificateHashError = QStringLiteral("The certificate description does not match the certificate.");
		if (Env::getSingleton<AppSettings>()->getGeneralSettings().isDeveloperMode())
		{
			qCCritical(developermode) << certificateHashError;
		}
		else
		{
			qCritical() << certificateHashError;
			updateStatus(GlobalStatus::Code::Workflow_Certificate_Hash_Error);
			Q_EMIT fireAbort(FailureCode::Reason::Certificate_Check_Failed_Hash_Mismatch);
			return;
		}
	}

	// check same origin policy for TCToken URL and subject URL
	const QString& subjectUrlString = getContext()->getDidAuthenticateEac1()->getCertificateDescription()->getSubjectUrl();
	const QUrl& tcTockenUrl = getContext()->getTcTokenUrl();

	qDebug() << "Subject URL from AT CVC (eService certificate) description:" << subjectUrlString;
	qDebug() << "TCToken URL:" << tcTockenUrl;

	qDebug() << "SOP-Check succeeded.";

	Q_EMIT fireContinue();
}
