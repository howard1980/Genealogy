package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXRender;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;
import com.maxiaohua.genealogy.fw.core.service.ServiceResponse;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class ServiceOutputParamInterceptor implements Interceptor {
    
    private static final String ENCODING = "UTF-8";
    
    private AJAXRender ajaxRender;

    
    @Override
    public void intercept(
            InterceptorChain chain) throws Exception {
        ServiceResponse serviceResponse = chain.getServiceOutput();
        String jsonOutput = ajaxRender.render(serviceResponse);
       
        if(chain.getServiceId().equals("SsWeiXinpayNotify")){
        	chain.setJsonOutput("Success");
        }
        else{
        	chain.setJsonOutput(jsonOutput);
        }
        
        Object nameObj = RequestContext.open().getElement(RequestContext.Key.FileName);
        Object contentObj = RequestContext.open().getElement(RequestContext.Key.FileContent);
        if (nameObj != null && contentObj != null) {
            downloadFile(chain.getRequest(), chain.getResponse(), nameObj, contentObj);
        }

        chain.next();
    }

    
    public void setAjaxRender(
            AJAXRender ajaxRender) {
        this.ajaxRender = ajaxRender;
    }

    
    protected void downloadFile(
            HttpServletRequest request,
            HttpServletResponse response,
            Object nameObj,
            Object contentObj) throws Exception {
        String name = (String) nameObj;
        byte[] content = (byte[]) contentObj;

        OutputStream out = null;
        response.setContentType("application/octet-stream;charset=" + ENCODING);
        response.setContentLength(content.length);
        response.setHeader("Cache-Control", "public");
        response.setHeader("Pragma", "public");
        try {
            String agent = request.getHeader("USER-AGENT");
            if (null != agent && -1 != agent.indexOf("MSIE")) {
                name = URLEncoder.encode(name, ENCODING);
            } else if (null != agent && -1 != agent.indexOf("Mozilla")) {
                name = "=?" + ENCODING + "?B?" + new String(StringUtil.encodeBase64(name.getBytes()), ENCODING) + "?=";
            }
            response.setHeader("Content-Disposition", "attachment;filename=\"" + name + "\"");
            out = response.getOutputStream();
            out.write(content);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}