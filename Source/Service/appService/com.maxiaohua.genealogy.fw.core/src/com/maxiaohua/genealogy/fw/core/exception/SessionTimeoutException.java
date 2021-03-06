package com.maxiaohua.genealogy.fw.core.exception;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;


public class SessionTimeoutException extends ApplicationException {
    
    private static final long serialVersionUID = 1L;

    
    public SessionTimeoutException(
            Throwable cause,
            Object... parameters) {
        super(cause, MessageCode.M10050CM, parameters);
    }

    
    public SessionTimeoutException(
            Object... parameters) {
        super(MessageCode.M10050CM, parameters);
    }
}