package com.maxiaohua.genealogy.fw.core.config;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;


public class XMLBeans implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private static final String NAME_SEP_STR = ",";
    
    private static final String TYPE_SEP_STR = "=";
    
    private Map<String, XMLBean> beans = new LinkedHashMap<String, XMLBean>();
    
    private Map<String, XMLResource> resources = new LinkedHashMap<String, XMLResource>();

    
    public XMLBean getBean(
            String name) {
        return beans.get(name);
    }

    
    public Collection<XMLBean> getBeans() {
        return beans.values();
    }
    
    public Collection<XMLResource> getResources() {
        return resources.values();
    }

    
    public void addBean(
            XMLBean bean) {
        String key = bean.getName();
        if (key == null) {
            throw new RuntimeException("Failed to load bean definition with null.");
        }
        if (beans.containsKey(key)) {
            throw new RuntimeException("Found duplicate bean definition [" + key + "].");
        }
        beans.put(key, bean);
    }

    
    public void addResource(
            XMLResource resource) {
        String key = resource.getResource();
        if (key == null) {
            throw new RuntimeException("Failed to load resource definition with null.");
        }
        if (resources.containsKey(key)) {
            throw new RuntimeException("Found duplicate resource definition [" + key + "].");
        }
        resources.put(resource.getResource(), resource);
    }

    
    public void addBeans(
            XMLBeans beans) {

        for (XMLResource resource : beans.getResources()) {
            addResource(resource);
        }
        for (XMLBean bean : beans.getBeans()) {
            addBean(bean);
        }
    }

    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (XMLBean bean : beans.values()) {
            builder.append(bean.getName());
            builder.append(TYPE_SEP_STR);
            builder.append(bean.getType());
            builder.append(NAME_SEP_STR);
        }
        for (XMLResource resource : resources.values()) {
            builder.append(resource.getResource());
            builder.append(NAME_SEP_STR);
        }
        return builder.toString();
    }
}