package com.maxiaohua.genealogy.fw.core.config;

import java.util.ArrayList;
import java.util.List;


public class XMLBean implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private static final String SEP_STR = ":";

    
    private String name;
    
    private String type;
    
    private String scope;
    
    private List<XMLBeanProperty> properties;
    
    private List<XMLBeanConstructorArg> constructorArgs;

    
    public void addConstructorArg(
            XMLBeanConstructorArg constructorArg) {
        if (this.constructorArgs == null) {
            this.constructorArgs = new ArrayList<XMLBeanConstructorArg>();
        }
        this.constructorArgs.add(constructorArg);
    }

    
    public void addProperty(
            XMLBeanProperty property) {
        if (this.properties == null) {
            this.properties = new ArrayList<XMLBeanProperty>();
        }
        this.properties.add(property);
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(
            String name) {
        this.name = name;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(
            String type) {
        this.type = type;
    }

    
    public String getScope() {
        return scope;
    }

    
    public void setScope(
            String scope) {
        this.scope = scope;
    }

    
    public List<XMLBeanProperty> getProperties() {
        return properties;
    }

    
    public void setProperties(
            List<XMLBeanProperty> properties) {
        this.properties = properties;
    }

    
    public List<XMLBeanConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    
    public void setConstructorArgs(
            List<XMLBeanConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    
    @Override
    public String toString() {
        return name + SEP_STR + type;
    }
}