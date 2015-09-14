package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import javax.naming.directory.DirContext;

import com.maxiaohua.genealogy.fw.core.bean.LDAPFactory;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;


public class LDAPInterceptor implements Interceptor {
    
    private LDAPFactory ldapFactory;

	
    @Override
    public void intercept(
            InterceptorChain chain) throws Exception {
        RequestContext requestContext = RequestContext.open();
        DirContext dirContext = null;
        try {

            
        	dirContext = ldapFactory.initialLDAPContext();

            
            requestContext.putElement(RequestContext.Key.LDAPContext, dirContext);

            chain.next();
        }
        finally {
            
            if (dirContext != null) {
            	dirContext.close();
            }
        }
    }

    
	public void setLdapFactory(
			LDAPFactory ldapFactory) {
		this.ldapFactory = ldapFactory;
	}

}