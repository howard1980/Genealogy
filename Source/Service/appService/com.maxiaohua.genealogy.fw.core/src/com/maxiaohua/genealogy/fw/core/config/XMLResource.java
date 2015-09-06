package com.maxiaohua.genealogy.fw.core.config;



public class XMLResource implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String resource;

    
    public String getResource() {
        return resource;
    }
    
    public void setResource(
            String resource) {
        this.resource = resource;
    }

    
    @Override
    public String toString() {
        return resource;
    }
}