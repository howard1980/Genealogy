package com.maxiaohua.genealogy.fw.core.interceptor;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXRender;
import com.maxiaohua.genealogy.fw.core.exception.ExceptionHandler;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;


public interface InterceptorChain {
	
	void next();

	
	String getSysId();

	
	void setSysId(
			String sysId);

	
	ServletContext getContext();

	
	HttpServletRequest getRequest();

	
	HttpServletResponse getResponse();

	
	Locale getLocale();

	
	void setContext(
			ServletContext context);

	
	void setRequest(
			HttpServletRequest request);

	
	void setResponse(
			HttpServletResponse response);

	
	void setLocale(
			Locale locale);

	
	String getServiceId();

	
	void setServiceId(
			String serviceId);

	
	String getJsonInput();

	
	void setJsonInput(
			String jsonInput);

	
	String getJsonOutput();

	
	void setJsonOutput(
			String jsonOutput);

	
	void setExceptionHandlers(
			Map<String, ExceptionHandler> exceptionHandlers);

	
	Map<String, ExceptionHandler> getExceptionHandlers();

	
	void setInterceptors(
			List<Interceptor> interceptors);

	
	List<Interceptor> getInterceptors();

	
	Object getServiceInput();

	
	void setServiceInput(
			Object serviceInput);

	
	ServiceResponse getServiceOutput();

	
	void setServiceOutput(
			ServiceResponse serviceOutput);

	
	AJAXRender getAjaxRender();

	
	void setAjaxRender(
			AJAXRender ajaxRender);

	
	boolean isCaughtExpectedException();

	
	void setCaughtExpectedException(
			boolean caughtExpectedException);
	
	String getUserID();
	void setUserID(String userID);
	
	String getTimestamp();
	void setTimestamp(String timestamp);
	
	String getCode();
	void setCode(String code);
}