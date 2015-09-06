package com.maxiaohua.genealogy.fw.core.config;

import java.net.URL;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.xmlrules.DigesterLoader;

import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.bean.impl.BeanFactoryImpl;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;


public class SystemContext {
	
	protected static final Logger appLogger = LogFactory.getLogger();
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	private static BeanFactory beanFactory = null;

	
	public static BeanFactory getBeanFactory() {
		return beanFactory;
	}

	
	public synchronized static final void init(
			String resource) {
		try {
			
			XMLBeans xmlBeans = loadResource(resource);

			
			beanFactory = new BeanFactoryImpl(xmlBeans, true);

			debugLogger.info("BeanFactory init successful.");
			debugLogger.info(xmlBeans);
		} catch (Exception e) {
			throw new SystemContextException(e);
		}
	}

	
	public static XMLBeans loadResource(
			String resource) throws Exception {
		
		XMLBeans xmlBeans = new XMLBeans();
		loadResource(xmlBeans, defaultDigester, resource);
		return xmlBeans;
	}

	
	private static final void loadResource(
			XMLBeans resultXMLBeans,
			Digester defaultDigester,
			String resource) throws Exception {
		
		URL resourceUrl = Thread.currentThread().getContextClassLoader().getResource(resource);

		if (resourceUrl == null) {
			throw new RuntimeException("Faild to read resource file [" + resource + "].");
		}

		
		XMLBeans currentXMLBeans = (XMLBeans) defaultDigester.parse(resourceUrl);
		resultXMLBeans.addBeans(currentXMLBeans);

		
		for (XMLResource impResource : currentXMLBeans.getResources()) {
			loadResource(resultXMLBeans, defaultDigester, impResource.getResource());
		}
	}

	
	private static final String RULE_MAPPING_DEFINE = SystemContext.class.getPackage().getName().replace(".", "/") + "/systemContextRule.xml";
	
	private static final Digester defaultDigester = DigesterLoader.createDigester(SystemContext.class.getClassLoader().getResource(
			RULE_MAPPING_DEFINE));
}