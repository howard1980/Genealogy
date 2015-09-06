package com.maxiaohua.genealogy.fw.core.ajax;

import java.lang.reflect.Type;


public interface AJAXParser {
    
    Object parse(
            String inStr,
            Class<?> clazz,
            Type genericType) throws Exception;
}