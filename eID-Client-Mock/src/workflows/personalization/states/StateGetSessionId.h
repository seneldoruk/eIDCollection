/**
 * Copyright (c) 2014-2024 Governikus GmbH & Co. KG, Germany
 */

/*!
 * \brief get the xml data from the given url
 */

#pragma once

#include "states/StateGenericProviderCommunication.h"


class test_StateGetSessionId;


namespace governikus
{

class StateGetSessionId
	: public StateGenericProviderCommunication
{
	Q_OBJECT
	friend class StateBuilder;
	friend class ::test_StateGetSessionId;

	private:
		explicit StateGetSessionId(const QSharedPointer<WorkflowContext>& pContext);

		QUrl getRequestUrl() const override;
		void setProgress() const override;

		[[nodiscard]] bool parseResponse(const QByteArray& pData) const;

		void handleNetworkReply(const QByteArray& pContent) override;
};

} // namespace governikus
