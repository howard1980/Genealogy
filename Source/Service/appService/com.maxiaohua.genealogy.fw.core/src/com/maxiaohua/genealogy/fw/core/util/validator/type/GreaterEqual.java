
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.util.validator.impl.GreaterEqualValidator;


@Deprecated
@RuleDescriptor("GreaterEqual")
@Constraint(validator = GreaterEqualValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface GreaterEqual {
    
    public String compareTo();

    
    public static final String DEFAULT_ERROR_CODE = "E0020";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}