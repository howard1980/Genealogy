package com.maxiaohua.genealogy.fw.core.properties.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;


public class MessagePropertiesImpl extends AbstractMessageProperties {
    
    public MessagePropertiesImpl(
            String msgResources) {
        super(msgResources);
    }

    
    protected Map<String, String> loadResourceAsMap(
            String messageFile) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(messageFile, getLocale());

        Map<String, String> singleResource = new HashMap<String, String>();
        Iterator<String> keys = resourceBundle.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            singleResource.put(key, resourceBundle.getString(key));
        }
        return singleResource;
    }

}