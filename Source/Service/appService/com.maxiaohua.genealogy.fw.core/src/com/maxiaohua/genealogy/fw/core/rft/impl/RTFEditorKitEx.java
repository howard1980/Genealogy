package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;


public class RTFEditorKitEx extends StyledEditorKitEx {
    
    private static final long serialVersionUID = 1L;

    
    public RTFEditorKitEx() {
        super();
    }

    
    public String getContentType() {
        return "text/rtf";
    }

    
    public void read(
            InputStream in,
            Document doc,
            int pos) throws IOException, BadLocationException {

        if (doc instanceof StyledDocument) {
            
            
            RTFReaderEx rdr = new RTFReaderEx((StyledDocument) doc);
            rdr.readFromStream(in);
            rdr.close();
        } else {
            
            super.read(in, doc, pos);
        }
    }

    
    public void write(
            OutputStream out,
            Document doc,
            int pos,
            int len) throws IOException, BadLocationException {

        
        
        RTFGeneratorEx.writeDocument(doc, out);
    }

    
    public void read(
            Reader in,
            Document doc,
            int pos) throws IOException, BadLocationException {

        if (doc instanceof StyledDocument) {
            RTFReaderEx rdr = new RTFReaderEx((StyledDocument) doc);
            rdr.readFromReader(in);
            rdr.close();
        } else {
            
            super.read(in, doc, pos);
        }
    }

    
    public void write(
            Writer out,
            Document doc,
            int pos,
            int len) throws IOException, BadLocationException {

        throw new IOException("RTF is an 8-bit format");
    }
}