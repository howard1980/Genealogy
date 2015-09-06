
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.ByteValidator;


@RuleDescriptor("Byte")
@Constraint(validator = ByteValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Byte {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.E_ARG_INPUT_BYTE;

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}