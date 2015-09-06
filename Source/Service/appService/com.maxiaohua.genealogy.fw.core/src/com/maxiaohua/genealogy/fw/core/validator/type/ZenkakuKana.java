
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.ZenkakuKanaValidator;


@RuleDescriptor("ZenkakuKana")
@Constraint(validator = ZenkakuKanaValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ZenkakuKana {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10480CM;

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}