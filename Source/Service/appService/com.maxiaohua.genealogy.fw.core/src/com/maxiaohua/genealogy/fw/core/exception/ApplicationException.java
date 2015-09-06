package com.maxiaohua.genealogy.fw.core.exception;


public class ApplicationException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    private String messageId;
    
    private Object[] parameters;

    
    public ApplicationException(
            Throwable cause,
            String messageId,
            Object... parameters) {
        super(cause);
        this.messageId = messageId;
        this.parameters = parameters;
    }

    
    public ApplicationException(
            String messageId,
            Object... parameters) {
        this.messageId = messageId;
        this.parameters = parameters;
    }

    
    public String getMessageId() {
        return messageId;
    }

    
    public Object[] getParameters() {
        return parameters;
    }
}