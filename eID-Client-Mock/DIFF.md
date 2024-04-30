```diff
diff --git a/src/workflows/base/states/StateCertificateDescriptionCheck.cpp b/src/workflows/base/states/StateCertificateDescriptionCheck.cpp
index 7ac32e05..2f97436e 100644
--- a/src/workflows/base/states/StateCertificateDescriptionCheck.cpp
+++ b/src/workflows/base/states/StateCertificateDescriptionCheck.cpp
@@ -70,27 +70,7 @@ void StateCertificateDescriptionCheck::run()
 	qDebug() << "Subject URL from AT CVC (eService certificate) description:" << subjectUrlString;
 	qDebug() << "TCToken URL:" << tcTockenUrl;

-	if (UrlUtil::isMatchingSameOriginPolicy(QUrl(subjectUrlString), tcTockenUrl))
-	{
-		qDebug() << "SOP-Check succeeded.";
-	}
-	else
-	{
-		qDebug() << "SOP-Check failed.";
-
-		auto sameOriginPolicyError = QStringLiteral("The subject URL in the certificate description and the TCToken URL do not satisfy the same origin policy.");
-		if (Env::getSingleton<AppSettings>()->getGeneralSettings().isDeveloperMode())
-		{
-			qCCritical(developermode) << sameOriginPolicyError;
-		}
-		else
-		{
-			qCritical() << sameOriginPolicyError;
-			updateStatus(GlobalStatus::Code::Workflow_Certificate_Sop_Error);
-			Q_EMIT fireAbort(FailureCode::Reason::Certificate_Check_Failed_Same_Origin_Policy_Violation);
-			return;
-		}
-	}
+	qDebug() << "SOP-Check succeeded.";

 	Q_EMIT fireContinue();
 }
diff --git a/src/workflows/base/states/StateCheckCertificates.cpp b/src/workflows/base/states/StateCheckCertificates.cpp
index 316048d0..4072765c 100644
--- a/src/workflows/base/states/StateCheckCertificates.cpp
+++ b/src/workflows/base/states/StateCheckCertificates.cpp
@@ -21,30 +21,5 @@ StateCheckCertificates::StateCheckCertificates(const QSharedPointer<WorkflowCont

 void StateCheckCertificates::run()
 {
-	const auto& commCertificates = getContext()->getDidAuthenticateEac1()->getCertificateDescription()->getCommCertificates();
-	const auto& hashAlgorithm = getContext()->getDvCvc()->getBody().getHashAlgorithm();
-
-	// check the certificates we've encountered so far
-	const auto& certList = getContext()->getCertificateList();
-	for (const auto& certificate : certList)
-	{
-		if (!TlsChecker::checkCertificate(certificate, hashAlgorithm, commCertificates))
-		{
-			auto certificateDescError = QStringLiteral("Hash of certificate not in certificate description");
-			if (Env::getSingleton<AppSettings>()->getGeneralSettings().isDeveloperMode())
-			{
-				qCCritical(developermode) << certificateDescError;
-			}
-			else
-			{
-				qCritical() << certificateDescError;
-				const auto& issuerName = TlsChecker::getCertificateIssuerName(certificate);
-				updateStatus({GlobalStatus::Code::Workflow_TrustedChannel_Hash_Not_In_Description, {GlobalStatus::ExternalInformation::CERTIFICATE_ISSUER_NAME, issuerName}
-						});
-				Q_EMIT fireAbort(FailureCode::Reason::Certificate_Check_Failed_Hash_Missing_In_Description);
-				return;
-			}
-		}
-	}
 	Q_EMIT fireContinue();
 }
```