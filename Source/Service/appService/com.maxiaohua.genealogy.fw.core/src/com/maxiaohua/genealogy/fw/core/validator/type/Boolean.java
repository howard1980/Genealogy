
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.BooleanValidator;


@RuleDescriptor("Boolean")
@Constraint(validator = BooleanValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Boolean {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10280CM;

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}