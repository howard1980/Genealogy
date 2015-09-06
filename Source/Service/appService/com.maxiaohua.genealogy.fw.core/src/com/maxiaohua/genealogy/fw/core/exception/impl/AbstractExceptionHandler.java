package com.maxiaohua.genealogy.fw.core.exception.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.exception.ExceptionHandler;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.properties.MessageProperties;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;


public abstract class AbstractExceptionHandler implements ExceptionHandler {
	
	protected static final Logger appLogger = LogFactory.getLogger();
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	protected static final ErrorLogger errorLogger = LogFactory.getErrorLogger();
	
	@AutoInject(name = "messageProperties")
	protected MessageProperties messageProperties;

	
	@Override
	public void handleException(
			InterceptorChain chain,
			Throwable cause,
			HttpServletRequest request,
			HttpServletResponse response) {

		ServiceResponse serviceResponse = chain.getServiceOutput();
		if (serviceResponse == null) {
			serviceResponse = new ServiceResponse();
			chain.setServiceOutput(serviceResponse);
		}
		serviceResponse.setSuccess(false);

		postAction(serviceResponse, cause);
	}

	
	abstract protected void postAction(
			ServiceResponse serviceResponse,
			Throwable cause);
}