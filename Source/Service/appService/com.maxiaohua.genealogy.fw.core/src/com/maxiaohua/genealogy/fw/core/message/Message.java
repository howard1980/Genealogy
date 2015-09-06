package com.maxiaohua.genealogy.fw.core.message;


public class Message implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String message;
    
    private String id;
    
    private Object[] parameters;
    
    private String type;
    
    private String skip;

    
    public Message(
            String messageId,
            Object[] parameters) {
        this.id = messageId;
        this.parameters = parameters;
    }

    
    public Message(
            String message,
            String messageId,
            Object[] parameters,
            String type,
            String skip) {
        this.message = message;
        this.id = messageId;
        this.parameters = parameters;
        this.type = type;
        this.skip = skip;
    }

    
    public String getMessage() {
        return message;
    }

    
    public void setMessage(
            String message) {
        this.message = message;
    }

    
    public String getId() {
        return id;
    }

    
    public void setId(
            String id) {
        this.id = id;
    }

    
    public Object[] getParameters() {
        return parameters;
    }

    
    public void setParameters(
            Object[] parameters) {
        this.parameters = parameters;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(
            String type) {
        this.type = type;
    }

    
    public String getSkip() {
        return skip;
    }

    
    public void setSkip(
            String skip) {
        this.skip = skip;
    }
}