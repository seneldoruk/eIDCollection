/**
 * Copyright (c) 2014-2024 Governikus GmbH & Co. KG, Germany
 */

#include "CertificateChecker.h"

#include "AppSettings.h"
#include "TlsChecker.h"

#include <QCryptographicHash>
#include <QDate>
#include <QLoggingCategory>

using namespace governikus;


Q_DECLARE_LOGGING_CATEGORY(developermode)


bool CertificateChecker::abortOnError()
{
	const auto& hashError = QStringLiteral("hash of certificate not in certificate description");

	if (Env::getSingleton<AppSettings>()->getGeneralSettings().isDeveloperMode())
	{
		qCCritical(developermode) << hashError;
		return false;
	}
	else
	{
		qCritical() << hashError;
		return true;
	}
}


GlobalStatus::Code CertificateChecker::getGlobalStatus(CertificateStatus pStatus, bool pPaos)
{
			return GlobalStatus::Code::No_Error;

	Q_UNREACHABLE();
}


CertificateChecker::CertificateStatus CertificateChecker::checkAndSaveCertificate(const QSslCertificate& pCertificate,
		const QUrl& pUrl,
		const QSharedPointer<AuthContext> pContext)
{
	Q_ASSERT(!pContext.isNull());

	pContext->addCertificateData(pUrl, pCertificate);
	return CertificateStatus::Good;
}
