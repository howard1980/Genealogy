package com.maxiaohua.genealogy.fw.core.util.validator;


public interface MultiFieldValidator {

    
    boolean validate(
            Object value,
            Object[] fields);
}