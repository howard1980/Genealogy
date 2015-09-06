package com.maxiaohua.genealogy.fw.core.properties.impl;

import java.util.ArrayList;
import java.util.List;


public class XMLMessageBeans implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<XMLMessageBean> beans = new ArrayList<XMLMessageBean>();

    
    public void addBean(
            XMLMessageBean bean) {
        beans.add(bean);
    }

    
    public List<XMLMessageBean> getBeans() {
        return beans;
    }

    
    public void setBeans(
            List<XMLMessageBean> beans) {
        this.beans = beans;
    }
}