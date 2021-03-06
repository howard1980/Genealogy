package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXRender;
import com.maxiaohua.genealogy.fw.core.connection.ConnectionManager;
import com.maxiaohua.genealogy.fw.core.exception.ExceptionHandler;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;


public class CISInterceptorChain implements InterceptorChain {
	
	private String sysId;
	
	private ServletContext context;
	
	private int count = -1;
	
	private Map<String, ExceptionHandler> exceptionHandlers = new HashMap<String, ExceptionHandler>();
	
	private AJAXRender ajaxRender;
	
	private List<Interceptor> interceptors;
	
	private boolean isExceptionHandled = false;
	
	private Locale locale;
	
	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	private String serviceId;
	
	private Object serviceInput;
	
	private ServiceResponse serviceOutput;
	
	private String jsonInput;
	
	private String jsonOutput;

	
	private ConnectionManager connectionManager;

	
	private boolean caughtExpectedException;

	
	private static final DebugLogger debugLogger = LogFactory.getDebugLogger();

	private String userID;
	
	private String timestamp;
	
	private String code;
	
	@Override
	public void next() {
		count++;
		if (count >= interceptors.size()) {
			return;
		}
		try {
			Interceptor current = interceptors.get(count);
			current.intercept(this);
		} catch (Exception cause) {
			try {
				if (!this.caughtExpectedException && connectionManager.checkStaleConnectionException((Throwable) cause)) {
					this.caughtExpectedException = true;
					debugLogger.error("连接失效错误发生", cause);
					debugLogger.writeDebugLog(this.serviceId + "重试");
					count = 0;
					Interceptor current = interceptors.get(count);
					current.intercept(this);
					if (count >= interceptors.size()) {
						return;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			if (isExceptionHandled) {
				return;
			}

			
			isExceptionHandled = true;
			Class<?> exception = cause.getClass();
			boolean isDefaulflag = true;
			ExceptionHandler handler = null;
			while (!exception.getName().equals(Object.class.getName())) {
				if (!isDefaulflag) {
					break;
				}
				handler = exceptionHandlers.get(exception.getName());
				if (handler != null) {
					handler.handleException(this, cause, request, response);
					isDefaulflag = false;
				}
				exception = exception.getSuperclass();
			}
			
			//this.getServiceOutput().addExceptionMessage(exception);
			this.setJsonOutput(ajaxRender.render(this.getServiceOutput()));
			return;
		}
	}

	
	public void setContext(
			ServletContext context) {
		this.context = context;
	}

	
	public void setInterceptors(
			List<Interceptor> interceptors) {
		this.interceptors = interceptors;
	}

	
	@Override
	public void setLocale(
			Locale locale) {
		this.locale = locale;
	}

	
	@Override
	public void setRequest(
			HttpServletRequest request) {
		this.request = request;

	}

	
	@Override
	public void setResponse(
			HttpServletResponse response) {
		this.response = response;
	}

	
	@Override
	public ServletContext getContext() {
		return context;
	}

	
	@Override
	public Locale getLocale() {
		return locale;
	}

	
	@Override
	public HttpServletRequest getRequest() {
		return request;
	}

	
	@Override
	public HttpServletResponse getResponse() {
		return response;
	}

	
	public String getServiceId() {
		return serviceId;
	}

	
	public void setServiceId(
			String serviceId) {
		this.serviceId = serviceId;
	}

	
	public String getJsonInput() {
		return jsonInput;
	}

	
	public void setJsonInput(
			String jsonInput) {
		this.jsonInput = jsonInput;
	}

	
	public Map<String, ExceptionHandler> getExceptionHandlers() {
		return exceptionHandlers;
	}

	
	public void setExceptionHandlers(
			Map<String, ExceptionHandler> exceptionHandlers) {
		this.exceptionHandlers = exceptionHandlers;
	}

	
	public List<Interceptor> getInterceptors() {
		return interceptors;
	}

	
	public Object getServiceInput() {
		return serviceInput;
	}

	
	public void setServiceInput(
			Object serviceInput) {
		this.serviceInput = serviceInput;
	}

	
	public ServiceResponse getServiceOutput() {
		return serviceOutput;
	}

	
	public void setServiceOutput(
			ServiceResponse serviceOutput) {
		this.serviceOutput = serviceOutput;
	}

	
	public String getJsonOutput() {
		return jsonOutput;
	}

	
	public void setJsonOutput(
			String jsonOutput) {
		this.jsonOutput = jsonOutput;
	}

	
	@Override
	public String getSysId() {
		return sysId;
	}

	
	@Override
	public void setSysId(
			String sysId) {
		this.sysId = sysId;
	}

	
	public AJAXRender getAjaxRender() {
		return ajaxRender;
	}

	
	public void setAjaxRender(
			AJAXRender ajaxRender) {
		this.ajaxRender = ajaxRender;
	}

	
	public ConnectionManager getConnectionManager() {
		return connectionManager;
	}

	
	public void setConnectionManager(
			ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	
	public boolean isCaughtExpectedException() {
		return caughtExpectedException;
	}

	
	public void setCaughtExpectedException(
			boolean caughtExpectedException) {
		this.caughtExpectedException = caughtExpectedException;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(
			String userID) {
		this.userID = userID;
	}

	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(
			String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(
			String code) {
		this.code = code;
	}

}