
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface ByteLength {
    
    public int min() default -1;

    
    public int max() default -1;

    
    public int precision() default -1;
}