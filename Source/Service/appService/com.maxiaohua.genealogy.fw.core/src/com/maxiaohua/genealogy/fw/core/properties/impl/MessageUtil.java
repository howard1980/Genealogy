package com.maxiaohua.genealogy.fw.core.properties.impl;

import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.properties.MessageProperties;


public abstract class MessageUtil {
	
	private static final String MESSAGE_PROPERTIES_NAME = "messageProperties";

	
	private static MessageProperties messageProperties;

	static {
		BeanFactory beanFactory = SystemContext.getBeanFactory();
		try {
			messageProperties = beanFactory.beanOfName(MESSAGE_PROPERTIES_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static String replaceMessageOptions(
			String message,
			Object[] parameters) {
		if (message == null) {
			return "";
		}
		if (message != null && parameters == null) {
			return message;
		}
		for (int i = 0; i < parameters.length; i++) {
			String flag = "{" + i + "}";
			String repStr = String.valueOf(parameters[i]);
			if (message.contains(flag)) {
				message = message.replace(flag, repStr);
			}
		}
		return message;
	}

	
	public static String getMessageContent(
			String message) {
		if (message == null) {
			return "";
		}
		
		message = message.substring(message.indexOf(",") + 1);
		
		message = message.substring(message.indexOf(",") + 1);

		return message;
	}

	
	public static String getMessageType(
			String message) {
		if (message == null) {
			return "";
		}
		String messageType = message.substring(0, message.indexOf(","));

		return messageType;
	}

	
	public static String getMessage(
			String messageId,
			Object... parameters) {
		if (messageId == null) {
			return "";
		}
		if (messageId != null && parameters == null) {
			return getMessageContent(messageProperties.get(messageId));
		}

		return messageProperties.get(messageId, parameters);
	}

}