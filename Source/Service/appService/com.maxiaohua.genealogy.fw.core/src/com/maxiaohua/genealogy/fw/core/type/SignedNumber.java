
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface SignedNumber {
    
    public static enum Type {
        ORIGIN, PLUS_APPEND, PLUS_REMOVE
    }

    
    public Type value() default Type.ORIGIN;
}