package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.NoAuthentication;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;

public class WechetPayControlInterceptor implements Interceptor {
	
	private static final Logger appLogger = LogFactory.getLogger();
	
	private static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	private static final ErrorLogger errorLogger = LogFactory.getErrorLogger();

	
	@Override
	public void intercept(
			InterceptorChain chain) throws Exception {
		boolean isFirstTime = chain.isCaughtExpectedException();
		RequestContext requestContext = RequestContext.open();
		requestContext.putElement(RequestContext.Key.Request, chain.getRequest());
		requestContext.putElement(RequestContext.Key.Response, chain.getResponse());
		
		chain.next();

		if (!isFirstTime) {
			appLogger.debug(chain.getJsonOutput());
			appLogger.info( "获取微信token值#end#");
			debugLogger.writeWSLog("获取微信token值#end#");
		}
	}

	
	protected void requestContextControl(
			String serviceId,
			String userId) {
		RequestContext requestContext = RequestContext.open();

		
		java.sql.Timestamp serviceStartTime = new java.sql.Timestamp(System.currentTimeMillis());
		RequestContext.open().putElement(RequestContext.Key.ServiceStartTime, serviceStartTime);

		if (!StringUtil.isEmpty(userId)) {
			requestContext.putElement(RequestContext.Key.UserId, userId);
		}
	}

	protected boolean validateAccess(
			String userId,
			String timestamp,
			String code) {
		
		if (StringUtil.isEmpty(userId)) {
			
			errorLogger.writeErrorLog("没有登录直接访问，导致发生Session错误。");
			appLogger.error("没有登录直接访问，导致发生Session错误。", null);
			debugLogger.error("没有登录直接访问，导致发生Session错误。", null);
			throw new ApplicationException(MessageCode.M10040CM);
		} else {
			// 访问权限
		}
		return true;
	}

	
	@SuppressWarnings("rawtypes")
	protected boolean needAuthentication(
			AbstractService service) {
		return service != null && service.getClass().getAnnotation(NoAuthentication.class) == null;
	}
}