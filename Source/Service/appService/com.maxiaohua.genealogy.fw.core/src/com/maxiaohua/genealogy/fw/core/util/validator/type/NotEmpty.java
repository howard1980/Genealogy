
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.NotEmptyValidator;


@RuleDescriptor("NotEmpty")
@Constraint(validator = NotEmptyValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10380CM;

    
    public int junban() default 0;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}