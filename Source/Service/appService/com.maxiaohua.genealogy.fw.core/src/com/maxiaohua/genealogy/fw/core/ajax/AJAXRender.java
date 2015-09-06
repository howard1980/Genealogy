package com.maxiaohua.genealogy.fw.core.ajax;


public interface AJAXRender {
    
    String render(
            Object javaObj);

    
    boolean isIgnoreNull();

    
    void setIgnoreNull(
            boolean ignoreNull);

    
    boolean isIgnoreSpace();

    
    void setIgnoreSpace(
            boolean ignoreNull);

    
    int getArrayMaxRenderSize();

    
    void setArrayMaxRenderSize(
            int arrayMaxRenderSize);
}