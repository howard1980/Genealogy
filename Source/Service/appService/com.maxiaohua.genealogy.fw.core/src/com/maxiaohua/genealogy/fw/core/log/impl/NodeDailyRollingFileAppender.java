package com.maxiaohua.genealogy.fw.core.log.impl;

import java.io.IOException;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Layout;


public class NodeDailyRollingFileAppender extends DailyRollingFileAppender {
    
    private static final String NODE_ID = String.valueOf(System.getProperty("node.id") == null ? "0" : null);

    
    private static final String NODE_ID_TOKEN = "\\$nodeId\\$";

    
    public static String replaceNodeId(
            String fileName) {
        return fileName.replaceAll(NODE_ID_TOKEN, NODE_ID);
    }

    
    public NodeDailyRollingFileAppender() {
        super();
    }

    
    public NodeDailyRollingFileAppender(
            Layout layout,
            String filename,
            String datePattern) throws IOException {
        super(layout, replaceNodeId(filename), datePattern);
    }

    
    @Override
    public synchronized String getFile() {
        return replaceNodeId(super.getFile());
    }

    
    @Override
    public void setFile(
            String fileName) {
        super.setFile(replaceNodeId(fileName));
    }

    
    @Override
    public synchronized void setFile(
            String fileName,
            boolean append,
            boolean bufferedIO,
            int bufferSize) throws IOException {
        super.setFile(replaceNodeId(fileName), append, bufferedIO, bufferSize);
    }

}