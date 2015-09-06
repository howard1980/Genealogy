
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.ByteSizeValidator;


@RuleDescriptor("ByteSize")
@Constraint(validator = ByteSizeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ByteSize {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10490CM;

    
    public int junban() default 1;

    
    public int max() default 0;

    
    public int min() default 0;

    
    public String charSet() default "Shift_JIS";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}