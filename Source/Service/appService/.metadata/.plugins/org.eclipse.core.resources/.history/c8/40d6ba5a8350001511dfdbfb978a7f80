package com.maxiaohua.genealogy.fw.core.dao.lob.ex;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.maxiaohua.genealogy.fw.core.sql.CISBlob;


public class CISBlobTypeHandler implements TypeHandler<Blob> {

    
    @Override
    public Blob getResult(
            ResultSet resultSet,
            String name) throws SQLException {
        byte[] content = null;
        try {
            Blob blob = resultSet.getBlob(name);
            InputStream is = blob.getBinaryStream();
            content = new byte[is.available()];
            int temp;
            int index = 0;
            while ((temp = is.read()) != -1) {
                content[index++] = Byte.valueOf((byte) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISBlob(content);
    }

    
    @Override
    public Blob getResult(
            ResultSet resultSet,
            int i) throws SQLException {
        byte[] content = null;
        try {
            Blob blob = resultSet.getBlob(i);
            InputStream is = blob.getBinaryStream();
            content = new byte[is.available()];
            int temp;
            int index = 0;
            while ((temp = is.read()) != -1) {
                content[index++] = Byte.valueOf((byte) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISBlob(content);
    }

    
    @Override
    public Blob getResult(
            CallableStatement statement,
            int i) throws SQLException {
        byte[] content = null;
        try {
            Blob blob = statement.getBlob(i);
            InputStream is = blob.getBinaryStream();
            content = new byte[is.available()];
            int temp;
            int index = 0;
            while ((temp = is.read()) != -1) {
                content[index++] = Byte.valueOf((byte) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISBlob(content);
    }

    
    @Override
    public void setParameter(
            PreparedStatement statement,
            int paramIndex,
            Blob value,
            JdbcType jdbcType) throws SQLException {
        statement.setBlob(paramIndex, value);
    }

}