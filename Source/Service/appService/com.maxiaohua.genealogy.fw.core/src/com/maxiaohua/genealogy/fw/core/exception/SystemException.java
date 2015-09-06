package com.maxiaohua.genealogy.fw.core.exception;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;


public class SystemException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    private String messageId;
    
    private Object[] parameters;

    
    public SystemException(
            Throwable cause) {
        super(cause);
        messageId = MessageCode.M10070CM;
    }

    
    public SystemException(
            Throwable cause,
            String messageId,
            Object... parameters) {
        super(cause);
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