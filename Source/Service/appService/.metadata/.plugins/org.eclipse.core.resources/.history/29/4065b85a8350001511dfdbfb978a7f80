package com.maxiaohua.genealogy.fw.core.dao.lob.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.maxiaohua.genealogy.fw.core.sql.CISClob;


public class CISClobTypeHandler implements TypeHandler<Clob> {

    
    @Override
    public Clob getResult(
            ResultSet resultSet,
            String name) throws SQLException {
        char[] content = null;
        try {
            Clob clob = resultSet.getClob(name);
            BufferedReader reader = new BufferedReader(clob.getCharacterStream());
            StringBuilder contentStr = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                contentStr.append(line);
            }
            content = contentStr.toString().toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISClob(content);
    }

    
    @Override
    public Clob getResult(
            ResultSet resultSet,
            int i) throws SQLException {
        char[] content = null;
        try {
            Clob clob = resultSet.getClob(i);
            BufferedReader reader = new BufferedReader(clob.getCharacterStream());
            StringBuilder contentStr = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                contentStr.append(line);
            }
            content = contentStr.toString().toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISClob(content);
    }

    
    @Override
    public Clob getResult(
            CallableStatement statement,
            int i) throws SQLException {
        char[] content = null;
        try {
            Clob clob = statement.getClob(i);
            BufferedReader reader = new BufferedReader(clob.getCharacterStream());
            StringBuilder contentStr = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                contentStr.append(line);
            }
            content = contentStr.toString().toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CISClob(content);
    }

    
    @Override
    public void setParameter(
            PreparedStatement statement,
            int index,
            Clob value,
            JdbcType jdbcType) throws SQLException {
        statement.setClob(index, value);
    }

}