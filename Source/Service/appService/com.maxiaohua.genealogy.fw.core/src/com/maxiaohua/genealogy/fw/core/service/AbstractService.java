package com.maxiaohua.genealogy.fw.core.service;

import com.maxiaohua.genealogy.fw.core.biz.AbstractComponent;
import com.maxiaohua.genealogy.fw.core.exception.ValidationException;


public abstract class AbstractService<R, P> extends AbstractComponent {
    
    public static final String SERVICE_EXECUTE_METHOD = "execute";
    
    private static final String LOGIN_SERVICE = "SsLogin";
    
    private static final String REGISTER_SERVICE = "SsRegister";
    
    private static final String LOGOUT_SERVICE = "SsLogout";
    
    private static final String SENDVALIDCODE_SERVICE = "SsSendValidCode";
    
    private static final String GETAPPVERSION_SERVICE = "SsGetAppVersion";
    
    private static final String GETPASSWORD_SERVICE = "SsGetPassword";

    
    public void validate(
            P input) throws ValidationException {
    }

    
    public abstract R execute(
            P input);

    
    public void preExecute(
            P input) {
    }

    
    public R postExecute(
            P input,
            R output) {
        return output;
    }

    
    public void exceptionExecute(
            P input,
            Exception ex) {
    }

    
    public void finallyExecute(
            P input,
            R output) {
    }

    
    public static boolean isLoginService(
            String serviceId) {
        if (LOGIN_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isRegisterService(
            String serviceId) {
        if (REGISTER_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLogoutService(
            String serviceId) {
        if (LOGOUT_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isSendValidCodeService(
            String serviceId) {
        if (SENDVALIDCODE_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isGetAppVersionService(
            String serviceId) {
        if (GETAPPVERSION_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isGetPasswordService(
            String serviceId) {
        if (GETPASSWORD_SERVICE.equals(serviceId)) {
            return true;
        } else {
            return false;
        }
    }
}