package com.maxiaohua.genealogy.fw.core.validator;


public interface MultiFieldValidator {

    
    boolean validate(
            Object value,
            Object[] fields);
}