package com.maxiaohua.genealogy.fw.core.exception.impl;

import com.maxiaohua.genealogy.fw.core.message.Message;
import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;
import com.maxiaohua.genealogy.fw.core.util.CompareUtil;


public class DefaultExceptionHandlerImpl extends AbstractExceptionHandler {

	
	@Override
	protected void postAction(
			ServiceResponse serviceResponse,
			Throwable cause) {
		String message = messageProperties.get(MessageCode.M10070CM, cause.getClass());
		String messageContent = messageProperties.get(MessageCode.M10070CM);
		String messageType = null;
		String messageSkip = null;
		if (!CompareUtil.equalTo(message, messageContent)) {
			String[] messageArray = messageContent.split(",");
			messageType = messageArray[0];
			messageSkip = messageArray[1];
		}
		errorLogger.writeErrorLog(cause.getMessage());
		appLogger.error(cause.getMessage(), cause);
		debugLogger.error(cause.getMessage(), cause);
		serviceResponse.addExceptionMessage(new Message(message, MessageCode.M10070CM, new Object[] { cause.getClass().toString() }, messageType,
				messageSkip));
	}
}