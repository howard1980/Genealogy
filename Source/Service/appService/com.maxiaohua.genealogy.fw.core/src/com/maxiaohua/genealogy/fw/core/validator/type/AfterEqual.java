
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.validator.impl.AfterEqualValidator;


@Deprecated
@RuleDescriptor("AfterEqual")
@Constraint(validator = AfterEqualValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterEqual {
    
    public static final String DEFAULT_ERROR_CODE = "E0050";

    
    public String compareTo();

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}