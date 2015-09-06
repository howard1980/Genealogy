package com.maxiaohua.genealogy.fw.core.properties.impl;


public class XMLMessageBean implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String id;
    
    private String type;
    
    private String text;
    
    private String skip;

    
    public String getId() {
        return id;
    }

    
    public void setId(
            String id) {
        this.id = id;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(
            String type) {
        this.type = type;
    }

    
    public String getText() {
        return text;
    }

    
    public void setText(
            String text) {
        this.text = text;
    }

    
    public String getSkip() {
        return skip;
    }

    
    public void setSkip(
            String skip) {
        this.skip = skip;
    }
}