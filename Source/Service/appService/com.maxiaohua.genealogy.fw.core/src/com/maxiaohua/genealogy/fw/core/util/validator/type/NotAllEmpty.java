
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.NotAllEmptyValidator;


@RuleDescriptor("NotAllEmpty")
@Constraint(validator = NotAllEmptyValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotAllEmpty {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.E_ARG_ENSURE_ANYNOE_NOT_EMPTY;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}