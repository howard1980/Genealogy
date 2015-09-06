
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.DoubleRangeValidator;


@RuleDescriptor("DoubleRange")
@Constraint(validator = DoubleRangeValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DoubleRange {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10520CM;

    
    public int junban() default 1;

    
    public String lagerEqual() default "";

    
    public String lagerThan() default "";

    
    public String lessEqual() default "";

    
    public String lessThan() default "";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}