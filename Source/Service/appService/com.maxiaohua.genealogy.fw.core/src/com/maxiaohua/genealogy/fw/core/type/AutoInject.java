
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInject {
    
    public static final String DEFAULT = "";

    
    public String name() default DEFAULT;
}