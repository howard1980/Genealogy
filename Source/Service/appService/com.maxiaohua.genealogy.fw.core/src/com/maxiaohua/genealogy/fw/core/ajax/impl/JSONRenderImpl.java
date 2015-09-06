package com.maxiaohua.genealogy.fw.core.ajax.impl;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXRender;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class JSONRenderImpl extends JSONSupport implements AJAXRender {
    
    private boolean ignoreNull = true;
    
    private boolean ignoreSpace = true;
    
    private int arrayMaxRenderSize = Integer.MAX_VALUE;

    
    @Override
    public String render(
            Object obj) {
        if (obj == null) {
            return JSON_NULL_STR;
        }

        StringBuilder buf = new StringBuilder();
        try {
            
            Class<?> clazz = obj.getClass();

            String json = null;
            if (isBasicType(clazz)) {
                
                json = renderBasic(obj);
                buf.append(json);
            } else if (isServiceBeanType(clazz)) {
                
                json = renderBean(obj);
                buf.append(json);
            } else if (clazz.isArray()) {
                
                json = renderArray(obj);
                buf.append(json);
            } else if (List.class.isAssignableFrom(clazz)) {
                
                json = renderList((List<?>) obj);
                buf.append(json);
            } else if (Map.class.isAssignableFrom(clazz)) {
                
                json = renderMap((Map<?, ?>) obj);
                buf.append(json);
            } else {
                
                buf.append("[ERROR] unsupport data type [" + clazz + "] for json render.");
            }
        } catch (Exception e) {
            buf.append("[ERROR] unknow json parse error.");
        }

        return buf.toString();
    }

    
    protected String renderBean(
            Object obj) throws Exception {
        if (obj == null) {
            return JSON_NULL_STR;
        }
        Class<?> beanClazz = obj.getClass();
        BeanInfo info;

        info = Introspector.getBeanInfo(beanClazz);
        PropertyDescriptor[] propDescriptors = info.getPropertyDescriptors();

        StringBuilder buf = new StringBuilder();
        
        buf.append(JSON_MAP_BEGIN);
        int sequence = 0;
        for (PropertyDescriptor property : propDescriptors) {
            String name = property.getName();
            Class<?> propClazz = property.getPropertyType();
            if (Class.class.equals(propClazz)) {
                
                continue;
            }
            Method getter = property.getReadMethod();
            if (getter == null) {
                
                continue;
            }
            Object value = property.getReadMethod().invoke(obj, NULL_GETTER_PARAMS);

            if (value == null && ignoreNull) {
                
                continue;
            }

            if (sequence++ > 0) {
                buf.append(JSON_ELEMENT_SEP);
            }
            buf.append(JSON_PROPERTY_AROUND);
            buf.append(name);
            buf.append(JSON_PROPERTY_AROUND);
            buf.append(JSON_PROPERTY_SUFFIX);

            if (value == null) {
                
                buf.append(JSON_NULL_STR);
                continue;
            }

            
            propClazz = value.getClass();
            String json = null;
            if (isServiceBeanType(propClazz)) {
                json = renderBean(value);
                buf.append(json);
            } else if (isBasicType(propClazz)) {
                json = renderBasic(value);
                buf.append(json);
            } else if (propClazz.isArray()) {
                json = renderArray(value);
                buf.append(json);
            } else if (List.class.isAssignableFrom(propClazz)) {
                json = renderList((List<?>) value);
                buf.append(json);
            } else if (Map.class.isAssignableFrom(propClazz)) {
                json = renderMap((Map<?, ?>) value);
                buf.append(json);
            } else {
                buf.append("[ERROR] unsupport data type for " + beanClazz + "." + name + " [" + propClazz + "] during json render.");
            }
        }
        
        buf.append(JSON_MAP_END);
        return buf.toString();
    }

    
    protected String renderBasic(
            Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder buf = new StringBuilder();
        if (String.class.equals(clazz) || Character.class.equals(clazz) || char.class.equals(clazz)) {
            
            buf.append(JSON_TEXT_VALUE_AROUND);
            if (ignoreSpace) {
                
                buf.append(stringToJson(StringUtil.trimRight(String.valueOf(obj))));
            } else {
                buf.append(stringToJson(String.valueOf(obj)));
            }
            buf.append(JSON_TEXT_VALUE_AROUND);
        } else if (java.sql.Date.class.equals(clazz) || java.sql.Time.class.equals(clazz) || java.sql.Timestamp.class.equals(clazz)) {
            
            buf.append(JSON_TEXT_VALUE_AROUND);
            buf.append(String.valueOf(obj));
            buf.append(JSON_TEXT_VALUE_AROUND);
        } else if (java.util.Date.class.equals(clazz)) {
            
            buf.append(JSON_TEXT_VALUE_AROUND);
            buf.append(defaultUtilDateFormat.format((java.util.Date) obj));
            buf.append(JSON_TEXT_VALUE_AROUND);
        } else {
            
            buf.append(String.valueOf(obj));
        }
        return buf.toString();
    }

    
    private String stringToJson(
            String s) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            case '/':
                sb.append("\\/");
                break;
            default:
                if (ch <= '\u001F' || ch >= '\u007F') {
                    String ss = Integer.toHexString(ch);
                    sb.append("\\u");
                    for (int k = 0; k < 4 - ss.length(); k++) {
                        sb.append('0');
                    }
                    sb.append(ss.toUpperCase());
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    
    protected String renderArray(
            Object arrObj) throws Exception {
        StringBuilder buf = new StringBuilder();
        
        buf.append(JSON_ARRAY_BEGIN);
        for (int i = 0; i < Array.getLength(arrObj); i++) {
            if (i > 0) {
                buf.append(JSON_ELEMENT_SEP);
            }
            if (i >= arrayMaxRenderSize) {
                break;
            }
            Object value = Array.get(arrObj, i);
            buf.append(render(value));
        }
        
        buf.append(JSON_ARRAY_END);
        return buf.toString();
    }

    
    protected String renderList(
            List<?> lstObj) throws Exception {
        return renderArray(lstObj.toArray());
    }

    
    protected String renderMap(
            Map<?, ?> mapObj) throws Exception {
        StringBuilder buf = new StringBuilder();
        
        buf.append(JSON_MAP_BEGIN);

        int sequence = 0;
        for (Map.Entry<?, ?> entry : mapObj.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();

            if (value == null && ignoreNull) {
                
                continue;
            }

            if (sequence++ > 0) {
                buf.append(JSON_ELEMENT_SEP);
            }
            buf.append(render(key));
            buf.append(JSON_PROPERTY_SUFFIX);
            buf.append(render(value));
        }
        
        buf.append(JSON_MAP_END);
        return buf.toString();
    }

    
    public boolean isIgnoreNull() {
        return ignoreNull;
    }

    
    public void setIgnoreNull(
            boolean ignoreNull) {
        this.ignoreNull = ignoreNull;
    }

    
    public boolean isIgnoreSpace() {
        return ignoreSpace;
    }

    
    public void setIgnoreSpace(
            boolean ignoreSpace) {
        this.ignoreSpace = ignoreSpace;
    }

    
    public int getArrayMaxRenderSize() {
        return arrayMaxRenderSize;
    }

    
    public void setArrayMaxRenderSize(
            int arrayMaxRenderSize) {
        this.arrayMaxRenderSize = arrayMaxRenderSize;
    }
}