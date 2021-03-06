
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.SizeValidator;


@RuleDescriptor("Size")
@Constraint(validator = SizeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Size {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10440CM;

    
    public int junban() default 1;

    
    public int max();

    
    public int min() default 0;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}