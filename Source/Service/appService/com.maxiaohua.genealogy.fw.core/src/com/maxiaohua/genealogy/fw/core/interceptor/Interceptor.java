package com.maxiaohua.genealogy.fw.core.interceptor;


public interface Interceptor {
    
    void intercept(
            InterceptorChain chain) throws Exception;
}