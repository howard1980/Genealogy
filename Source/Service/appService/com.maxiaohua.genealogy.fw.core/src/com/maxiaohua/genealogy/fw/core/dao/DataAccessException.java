package com.maxiaohua.genealogy.fw.core.dao;


public class DataAccessException extends RuntimeException {
    
    private static final long serialVersionUID = -3147888263699426883L;

    
    public DataAccessException(
            String message) {
        super(message);
    }

    
    public DataAccessException(
            Throwable cause) {
        super(cause);
    }

    
    public DataAccessException(
            String message,
            Throwable cause) {
        super(message, cause);
    }
}