package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.io.ByteArrayInputStream;
import java.util.StringTokenizer;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Element;

import com.maxiaohua.genealogy.fw.core.rft.RTFHtmlConvertor;


public class RTFHtmlConvertorImpl implements RTFHtmlConvertor {
	
	public String convertRTFStringToHTMLString(
			String value) {
		String tempStr = RTFCharacterConvert.convertJapanese(value);
		String rtfString = convertRTFToHTML(tempStr);
		return rtfString;
	}

	
	private String convertRTFToHTML(
			String value) {
		String tmpStr = value;
		HTMLStateDTO htmlState = new HTMLStateDTO();
		tmpStr = convertRTFStringToHTML(tmpStr, htmlState);
		String resultStr = new String("<html><body>");
		StringTokenizer st = new StringTokenizer(tmpStr);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			if (s.startsWith("http://")) {
				s = "<a href='" + s + "'>" + s + "</a>";
			}
			resultStr += s + " ";
		}
		return resultStr + "</body></html>";
	}

	
	private String convertRTFStringToHTML(
			String value,
			HTMLStateDTO htmlState) {
		
		RTFEditorKitEx rtfeditorkit = new RTFEditorKitEx();
		DefaultStyledDocument defaultstyleddocument = new DefaultStyledDocument();
		readString(value, defaultstyleddocument, rtfeditorkit);
		value = scanDocument(defaultstyleddocument, htmlState);
		return value;
	}

	
	private void readString(
			String value,
			Document doc,
			RTFEditorKitEx rtfEditorKit) {
		try {
			ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(value.getBytes());
			rtfEditorKit.read(bytearrayinputstream, doc, 0);
		} catch (Exception exception) {
		    throw new RuntimeException(exception);
			
		}
	}

	
	private String scanDocument(
			Document doc,
			HTMLStateDTO htmlState) {
		String s = "";
		try {
			StringBuffer stringbuffer = new StringBuffer();
			Element element = doc.getDefaultRootElement();
			recurseElements(element, doc, stringbuffer, htmlState);
			htmlState.closeTags(stringbuffer);
			s = stringbuffer.toString();
		} catch (Exception exception) {
			return s;
			
		}
		return s;
	}

	
	private void recurseElements(
			Element element,
			Document doc,
			StringBuffer buf,
			HTMLStateDTO htmlstatemachine) {
		for (int i = 0; i < element.getElementCount(); i++) {
			Element element1 = element.getElement(i);
			scanAttributes(element1, doc, buf, htmlstatemachine);
			recurseElements(element1, doc, buf, htmlstatemachine);
		}
	}

	
	private void scanAttributes(
			Element element,
			Document doc,
			StringBuffer buf,
			HTMLStateDTO htmlState) {
		try {
			int i = element.getStartOffset();
			int j = element.getEndOffset();
			String s = doc.getText(i, j - i);
			javax.swing.text.AttributeSet attributeset = element.getAttributes();
			htmlState.updateState(attributeset, buf, element);
			String s1 = element.getName();
			if (s1.equalsIgnoreCase("content")) {
				s = s.replaceAll("\\t", htmlState.getSpaceTab(8));
				s = s.replaceAll("\\n", "<br />\n");
				s = htmlState.performFirstLineIndent(s);
				buf.append(s);
			}
		} catch (BadLocationException badlocationexception) {
			return;
		}
	}
}