package com.maxiaohua.genealogy.fw.core.log.impl;

import java.io.IOException;

import org.apache.log4j.Layout;
import org.apache.log4j.RollingFileAppender;


public class NodeRollingLogAppender extends RollingFileAppender {

    
    private static final String NODE_ID = String.valueOf(System.getProperty("node.id") == null ? "0" : null);

    
    private static final String NODE_ID_TOKEN = "\\$nodeId\\$";

    
    public static String replaceNodeId(
            String fileName) {
        return fileName.replaceAll(NODE_ID_TOKEN, NODE_ID);
    }

    
    public NodeRollingLogAppender() {
        super();
    }

    
    public NodeRollingLogAppender(
            Layout layout,
            String fileName) throws IOException {
        super(layout, replaceNodeId(fileName));
    }

    
    public NodeRollingLogAppender(
            Layout layout,
            String fileName,
            boolean append) throws IOException {
        super(layout, replaceNodeId(fileName), append);
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