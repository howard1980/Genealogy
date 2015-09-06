
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    
    public static final String SINGLETON = "singleton";
    
    public static final String PROTOTYPE = "prototype";

    
    public String scope() default PROTOTYPE;
}