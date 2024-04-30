/**
 * Copyright (c) 2014-2024 Governikus GmbH & Co. KG, Germany
 */

#include "StateCheckCertificates.h"

#include "AppSettings.h"
#include "TlsChecker.h"

using namespace governikus;

Q_DECLARE_LOGGING_CATEGORY(developermode)


StateCheckCertificates::StateCheckCertificates(const QSharedPointer<WorkflowContext>& pContext)
	: AbstractState(pContext)
	, GenericContextContainer(pContext)
{
}


void StateCheckCertificates::run()
{
	Q_EMIT fireContinue();
}
