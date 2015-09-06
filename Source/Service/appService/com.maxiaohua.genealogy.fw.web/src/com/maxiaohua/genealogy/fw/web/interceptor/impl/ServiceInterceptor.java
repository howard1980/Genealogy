package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import java.lang.reflect.Method;
import java.util.List;

import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.message.Message;
import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;
import com.maxiaohua.genealogy.fw.core.transaction.TransactionManager;
import com.maxiaohua.genealogy.fw.core.type.Transactional;


public class ServiceInterceptor implements Interceptor {

	
	private static final String SERVICE_TARGET_METHOD = "execute";
	
	private TransactionManager transactionManager;

	
	@SuppressWarnings("unchecked")
	@Override
	public void intercept(
			InterceptorChain chain) throws Exception {
		
		Object methodParam = chain.getServiceInput();
		String serviceId = chain.getServiceId();
		
		@SuppressWarnings("rawtypes")
		AbstractService service = (AbstractService) (SystemContext.getBeanFactory().getBean(serviceId));
		
		ServiceResponse serviceResponse = new ServiceResponse();
		
		Object output = null;
		try {
			if (requireTransaction(service.getClass())) {
				transactionManager.begin();
			}
			
			service.validate(methodParam);
			
			service.preExecute(methodParam);
			
			output = service.execute(methodParam);
			
			output = service.postExecute(methodParam, output);

			if (requireTransaction(service.getClass())) {
				
				transactionManager.commit();
			}

			
			serviceResponse.setSuccess(true);
			
			serviceResponse.setResult(output);
		} catch (Exception e) {
			
			service.exceptionExecute(methodParam, e);

			if (requireTransaction(service.getClass())) {
				transactionManager.rollback();
			}
			throw e;
		} finally {
			
			service.finallyExecute(methodParam, output);
			
			List<Message> messages = RequestContext.open().getMessageList();
			for (Message msg : messages) {
				msg.setMessage(service.getMessageProperties().get(msg.getId(), msg.getParameters()));
				serviceResponse.addMessage(msg);
			}
		}

		chain.setServiceOutput(serviceResponse);
		chain.next();
	}

	
	protected boolean requireTransaction(
			Class<?> serviceClazz) {
		for (Method method : serviceClazz.getMethods()) {
			if (SERVICE_TARGET_METHOD.equals(method.getName())) {
				Transactional tx = method.getAnnotation(Transactional.class);
				if (tx != null) {
					return true;
				}
			}
		}
		return false;
	}

	
	public void setTransactionManager(
			TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
}