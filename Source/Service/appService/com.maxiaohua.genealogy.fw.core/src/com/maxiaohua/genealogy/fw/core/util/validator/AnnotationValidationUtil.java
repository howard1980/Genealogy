package com.maxiaohua.genealogy.fw.core.util.validator;

import java.lang.annotation.Annotation;

import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.validator.type.Constraint;
import com.maxiaohua.genealogy.fw.core.validator.type.MultiField;


public class AnnotationValidationUtil {
	
	protected static final Logger appLogger = LogFactory.getLogger();
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	
	protected static final ErrorLogger errorLogger = LogFactory.getErrorLogger();

	
	public static AnnotationValidator validate(
			Object value,
			Annotation annotation,
			Object... parameters) {
		AnnotationValidator validator = null;

		try {
			
			if (annotation instanceof MultiField) { 
				MultiField multiField = (MultiField) annotation;
				Constraint constraint = multiField.validator().getAnnotation(Constraint.class);
				validator = (AnnotationValidator) constraint.validator().newInstance();
				
				if (validator.validate(annotation, value, parameters)) {
					validator = null;
				}
			} else {
				Constraint constraint = annotation.annotationType().getAnnotation(Constraint.class);
				validator = (AnnotationValidator) constraint.validator().newInstance();
				
				if (validator.validate(annotation, value, parameters)) {
					validator = null;
				}
			}
		} catch (InstantiationException ie) {
			errorLogger.writeErrorLog(ie.getMessage());
			appLogger.error(ie.getMessage(), ie);
			debugLogger.error(ie.getMessage(), ie);
		} catch (IllegalAccessException iae) {
			errorLogger.writeErrorLog(iae.getMessage());
			appLogger.error(iae.getMessage(), iae);
			debugLogger.error(iae.getMessage(), iae);
		}

		return validator;
	}
}