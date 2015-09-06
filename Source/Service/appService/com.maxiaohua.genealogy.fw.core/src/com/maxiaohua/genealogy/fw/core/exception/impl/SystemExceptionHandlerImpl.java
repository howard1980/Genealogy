package com.maxiaohua.genealogy.fw.core.exception.impl;

import com.maxiaohua.genealogy.fw.core.exception.SystemException;
import com.maxiaohua.genealogy.fw.core.message.Message;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;
import com.maxiaohua.genealogy.fw.core.util.CompareUtil;


public class SystemExceptionHandlerImpl extends AbstractExceptionHandler {

	
	@Override
	protected void postAction(
			ServiceResponse serviceResponse,
			Throwable e) {

		if (e instanceof SystemException) {
			SystemException ex = (SystemException) e;
			String message = messageProperties.get(ex.getMessageId(), ex.getParameters());
			String messageContent = messageProperties.get(ex.getMessageId());
			String messageType = null;
			String messageSkip = null;
			if (!CompareUtil.equalTo(message, messageContent)) {
				String[] messageArray = messageContent.split(",");
				messageType = messageArray[0];
				messageSkip = messageArray[1];
			}
			errorLogger.writeErrorLog(new Message(ex.getMessageId(), ex.getParameters()));
			appLogger.error(new Message(ex.getMessageId(), ex.getParameters()), e);
			debugLogger.error(new Message(ex.getMessageId(), ex.getParameters()), e);
			serviceResponse.addExceptionMessage(new Message(message, ex.getMessageId(), ex.getParameters(), messageType, messageSkip));
		}
	}

}