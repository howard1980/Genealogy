package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.dao.CISSqlSessionFactory;
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

public class ContextSessionControlInterceptor implements Interceptor {
	
	private static final Logger appLogger = LogFactory.getLogger();
	
	private static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	private static final ErrorLogger errorLogger = LogFactory.getErrorLogger();

	
	@Override
	public void intercept(
			InterceptorChain chain) throws Exception {
		boolean isFirstTime = chain.isCaughtExpectedException();
		
		String sysId = chain.getSysId();
		String serviceId = chain.getServiceId();
		
		if (StringUtil.isEmpty(sysId)) {
			RequestContext.open().putElement(RequestContext.Key.SystemId, CISSqlSessionFactory.DEFAULT_ENVIRONMENT_ID);
		} else {
			RequestContext.open().putElement(RequestContext.Key.SystemId, sysId);
		}
		
		requestContextControl(serviceId, chain.getUserID());
		
		@SuppressWarnings("rawtypes")
		AbstractService service = (AbstractService) (SystemContext.getBeanFactory().getBean(serviceId));
		
		if (service == null) {
			errorLogger.writeErrorLog(serviceId + "是无效的Service");
			appLogger.error(serviceId + "是无效的Service", null);
			debugLogger.error(serviceId + "是无效的Service", null);
			throw new ApplicationException(MessageCode.M10190CM);
		}
		String serviceName = service.getClass().getName();
		String appId = serviceName.substring(0, serviceName.indexOf("."));
		appId = appId.substring(appId.indexOf(".") + 1);
		RequestContext.open().putElement(RequestContext.Key.AppId, appId);

		appLogger.info(serviceId + "#begin#");
		appLogger.debug(chain.getJsonInput());
		debugLogger.writeWSLog(serviceId + "#begin#", chain.getJsonInput());
		
		StringBuilder buf = new StringBuilder();
		if(chain.getUserID()==null){
			buf.append("");
		}
		else
		{
			buf.append(chain.getUserID());
		}
		
		if(chain.getTimestamp()==null){
			buf.append("");
		}
		else
		{
			buf.append(chain.getTimestamp());
		}
		buf.append("com.sx166.www");
		
		/* 内部测试期临时注释
		if(chain.getCode() == null || !chain.getCode().equals(new String(LDAPUtil.generateToken(buf.toString())))){
			errorLogger.writeErrorLog("非法访问。");
			appLogger.error("非法访问。", null);
			debugLogger.error("非法访问。", null);
			throw new ApplicationException(MessageCode.M10040CM);
		}
		*/
		chain.setUserID("001");

		
		if (AbstractService.isLoginService(serviceId) || AbstractService.isRegisterService(serviceId)
				 || AbstractService.isSendValidCodeService(serviceId) || AbstractService.isGetAppVersionService(serviceId)
				 || AbstractService.isGetPasswordService(serviceId)) {
			// 个别处理
		} else {
			
			if (needAuthentication(service)) {
				validateAccess(chain.getUserID(), chain.getTimestamp(), chain.getCode());
			}
		}

		chain.next();

		if (!isFirstTime) {
			appLogger.debug(chain.getJsonOutput());
			appLogger.info(serviceId + "#end#");
			debugLogger.writeWSLog(chain.getJsonOutput(), serviceId + "#end#");
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