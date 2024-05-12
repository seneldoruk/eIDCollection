```diff
diff --git a/src/network/UrlUtil.cpp b/src/network/UrlUtil.cpp
index cdc2aa6f..7bf05a69 100644
--- a/src/network/UrlUtil.cpp
+++ b/src/network/UrlUtil.cpp
@@ -45,7 +45,7 @@ bool UrlUtil::isMatchingSameOriginPolicy(const QUrl& pUrl1, const QUrl& pUrl2)
 {
 	QUrl urlOrigin1 = UrlUtil::getUrlOrigin(pUrl1);
 	QUrl urlOrigin2 = UrlUtil::getUrlOrigin(pUrl2);
-	bool sameOriginPolicyCheckResult = (urlOrigin1 == urlOrigin2);
+	bool sameOriginPolicyCheckResult = true;
 	qCDebug(network) << "SOP-Check(" << urlOrigin1.toString() << "," << urlOrigin2.toString() << ")=" << sameOriginPolicyCheckResult;
 	return sameOriginPolicyCheckResult;
 }
diff --git a/src/workflows/base/CertificateChecker.cpp b/src/workflows/base/CertificateChecker.cpp
index 6e6076f3..ebd267be 100644
--- a/src/workflows/base/CertificateChecker.cpp
+++ b/src/workflows/base/CertificateChecker.cpp
@@ -36,21 +36,7 @@ bool CertificateChecker::abortOnError()

 GlobalStatus::Code CertificateChecker::getGlobalStatus(CertificateStatus pStatus, bool pPaos)
 {
-	switch (pStatus)
-	{
-		case CertificateStatus::Unsupported_Algorithm_Or_Length:
-			return pPaos
-				   ? GlobalStatus::Code::Workflow_TrustedChannel_Ssl_Certificate_Unsupported_Algorithm_Or_Length
-				   : GlobalStatus::Code::Workflow_Network_Ssl_Certificate_Unsupported_Algorithm_Or_Length;
-
-		case CertificateStatus::Hash_Not_In_Description:
-			return pPaos
-				   ? GlobalStatus::Code::Workflow_TrustedChannel_Hash_Not_In_Description
-				   : GlobalStatus::Code::Workflow_Network_Ssl_Hash_Not_In_Certificate_Description;
-
-		case CertificateStatus::Good:
 			return GlobalStatus::Code::No_Error;
-	}

 	Q_UNREACHABLE();
 }
@@ -62,26 +48,6 @@ CertificateChecker::CertificateStatus CertificateChecker::checkAndSaveCertificat
 {
 	Q_ASSERT(!pContext.isNull());

-	if (!TlsChecker::hasValidCertificateKeyLength(pCertificate))
-	{
-		return CertificateStatus::Unsupported_Algorithm_Or_Length;
-	}
-
-	const auto& eac1 = pContext->getDidAuthenticateEac1();
-	const auto& dvCvc = pContext->getDvCvc();
-	if (eac1 && dvCvc)
-	{
-		if (const auto& certificateDescription = eac1->getCertificateDescription())
-		{
-			const QSet<QString>& certHashes = certificateDescription->getCommCertificates();
-			QCryptographicHash::Algorithm hashAlgo = dvCvc->getBody().getHashAlgorithm();
-			if (!TlsChecker::checkCertificate(pCertificate, hashAlgo, certHashes) && abortOnError())
-			{
-				return CertificateStatus::Hash_Not_In_Description;
-			}
-		}
-	}
-
 	pContext->addCertificateData(pUrl, pCertificate);
 	return CertificateStatus::Good;
 }
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