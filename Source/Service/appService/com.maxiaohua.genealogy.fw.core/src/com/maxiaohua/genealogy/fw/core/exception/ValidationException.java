package com.maxiaohua.genealogy.fw.core.exception;

import java.util.ArrayList;
import java.util.List;


public class ValidationException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    
    private List<ValidationMessage> messageList = new ArrayList<ValidationMessage>();

    
    public ValidationException() {
    }

    
    public ValidationException(
            String messageId,
            Object[] parameters,
            String properties) {
        messageList.add(new ValidationMessage(messageId, parameters, properties));
    }

    
    public void addValidationException(
            String messageId,
            Object[] parameters,
            String properties) {
        messageList.add(new ValidationMessage(messageId, parameters, properties));
    }

    
    public int size() {
        return messageList.size();
    }

    
    public String getMessageId(
            int i) {
        return messageList.get(i).messageId;
    }

    
    public Object[] getParameters(
            int i) {
        return messageList.get(i).parameters;
    }

    
    public String getProperty(
            int i) {
        return messageList.get(i).property;
    }

    
    class ValidationMessage {
        
        private String messageId;
        
        private Object[] parameters;
        
        private String property;

        ValidationMessage(
                String messageId,
                Object[] parameters,
                String property) {
            this.messageId = messageId;
            this.parameters = parameters;
            this.property = property;
        }
    }
}