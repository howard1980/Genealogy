
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.maxiaohua.genealogy.fw.core.util.BeanFormatUtil;


@Retention(RetentionPolicy.RUNTIME)
public @interface ExFormatter {
    
    public Class<? extends BeanFormatUtil.Formatter> value();
}