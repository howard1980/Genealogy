package com.maxiaohua.genealogy.fw.core.file.impl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maxiaohua.genealogy.fw.core.file.FileAccessException;
import com.maxiaohua.genealogy.fw.core.file.FileConfig;
import com.maxiaohua.genealogy.fw.core.file.FileWriter;
import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.fw.core.type.Index;
import com.maxiaohua.genealogy.fw.core.util.BeanUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class CSVWriterImpl implements FileWriter {
    
    private List<String> titles;
    
    private Map<String, Method> getterMap;
    
    private Map<String, String> fieldColumnMap;

    
    public <E> void write(
            OutputStream csvFile,
            List<E> dtos) {
        write(csvFile, dtos, new FileConfig());
    }

    
    public <E> void write(
            OutputStream csvFile,
            List<E> dtos,
            FileConfig config) {
        if (dtos == null || dtos.size() == 0) {
            return;
        }

        int lineNo = 1;
        List<Object> lineItems = null;
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(csvFile, config.getCharSet()));

            for (E dto : dtos) {
                if (dto != null) {
                    init(dto.getClass());
                    break;
                }
            }

            for (E dto : dtos) {
                lineItems = new ArrayList<Object>();
                readDTOValues(lineItems, dto, config);
                writeLine(writer, formatLine(lineItems, config));
            }
        } catch (Exception e) {
            StringBuilder exLine = new StringBuilder();
            if (lineItems != null) {
                for (Object i : lineItems) {
                    exLine.append(String.valueOf(i));
                }
            }
            throw new FileAccessException(e, exLine.toString(), lineNo);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new FileAccessException(e);
                }
            }
        }
    }

    
    private void readDTOValues(
            List<Object> values,
            Object dtoObject,
            FileConfig config) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        if (dtoObject == null) {
            return;
        }
        List<String> titles = config.getUsedColumns(dtoObject.getClass());
        titles = titles == null || titles.size() == 0 ? this.titles : titles;
        for (String title : titles) {
            String fieldName = fieldColumnMap.get(title);
            Method getter = getterMap.get(fieldName);
            Object value = getter.invoke(dtoObject, new Object[0]);
            values.add(value);
        }
    }

    
    private String formatLine(
            List<Object> lineValues,
            FileConfig config) throws IOException {
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < lineValues.size(); i++) {
            Object value = lineValues.get(i);
            String strValue = null;
            if (value instanceof Date) {
                strValue = DateUtil.dateToString((Date) value, DateUtil.FORMAT.YYYYMMDDHHMMSSMMM);
            } else {
                strValue = StringUtil.objectToString(value);
            }
            strValue = strValue.contains(config.getSeparatorChar()) ? config.getTransferChar() + strValue + config.getTransferChar() : strValue;

            if (i > 0) {
                buf.append(config.getSeparatorChar());
            }
            buf.append(strValue);
        }
        return buf.toString();
    }

    
    protected void writeLine(
            BufferedWriter writer,
            String line) throws IOException {
        writer.write(line);
        writer.write(FileConfig.LINE_SEPARATOR);
        writer.flush();
    }

    
    protected void init(
            Class<?> clazz) {
        getterMap = BeanUtil.getGetters(clazz);
        fieldColumnMap = new HashMap<String, String>();
        Map<Integer, String> titleMap = new HashMap<Integer, String>();

        for (String fieldName : getterMap.keySet()) {
            Field field = null;
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                throw new FileAccessException(e);
            }
            Index columnIndexAnnotation = field.getAnnotation(Index.class);
            Alias columnNameAnnotation = field.getAnnotation(Alias.class);
            String fieldNameKey = columnNameAnnotation != null ? columnNameAnnotation.value() : fieldName;
            fieldColumnMap.put(fieldNameKey, fieldName);
            titleMap.put(columnIndexAnnotation.value(), fieldNameKey);
        }

        List<Integer> titleIndexList = new ArrayList<Integer>(titleMap.size());
        for (Map.Entry<Integer, String> entry : titleMap.entrySet()) {
            titleIndexList.add(entry.getKey());
        }
        Collections.sort(titleIndexList);
        titles = new ArrayList<String>(titleIndexList.size());
        for (Integer index : titleIndexList) {
            titles.add(titleMap.get(index));
        }
    }

}