package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;


public class ContextSessionControlInterceptor4Test extends ContextSessionControlInterceptor {
    
//    protected boolean validateSession(
//            HttpSession session,
//            boolean isLoggin) {
//        return true;
//    }

    
    @SuppressWarnings("rawtypes")
    protected boolean needAuthentication(
            AbstractService service) {
    	boolean needAuth = true;
        if (AbstractService.isLogoutService(service.getClass().getSimpleName())) {
            
        	needAuth = true;
        }
        return needAuth;
    }

    
//    @SuppressWarnings("rawtypes")
//    protected boolean validateAccess(
//    		String sysId,
//            AbstractService service,
//            HttpSession session) {
//        return true;
//    }
}