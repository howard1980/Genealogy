package com.maxiaohua.genealogy.fw.core.properties;

import java.util.Set;


public interface MessageProperties {
    
    String get(
            String id);

    
    String get(
            String id,
            Object... parameters);

    
    Set<String> keySet();
}