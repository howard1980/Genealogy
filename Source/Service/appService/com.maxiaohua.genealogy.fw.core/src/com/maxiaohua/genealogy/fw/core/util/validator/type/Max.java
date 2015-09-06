
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.MaxValidator;


@RuleDescriptor("Max")
@Constraint(validator = MaxValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Max {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10520CM;

    
    public int junban() default 1;

    
    public boolean ifEqual();

    
    public long max();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}