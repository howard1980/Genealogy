package com.maxiaohua.genealogy.fw.core.config;


public class SystemContextException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    
    public SystemContextException(
            Throwable cause) {
        super(cause.getMessage(), cause);
    }
}