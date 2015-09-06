
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface CloseChar {
    
    public final char EOF = '\n';

    
    public char value();
}