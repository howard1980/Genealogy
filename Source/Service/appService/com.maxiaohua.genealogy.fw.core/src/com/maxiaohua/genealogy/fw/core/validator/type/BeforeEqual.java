
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.validator.impl.BeforeEqualValidator;


@Deprecated
@RuleDescriptor("BeforeEqual")
@Constraint(validator = BeforeEqualValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BeforeEqual {
    
    public static final String DEFAULT_ERROR_CODE = "E0051";

    
    public int junban() default 1;

    
    public String compareTo();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}