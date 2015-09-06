package com.maxiaohua.genealogy.fw.core.ajax.impl;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;

import com.maxiaohua.genealogy.fw.core.ajax.AJAXParser;
import com.maxiaohua.genealogy.fw.core.ajax.AJAXParserException;
import com.maxiaohua.genealogy.fw.core.exception.ValidationException;
import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidationUtil;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.validator.type.MultiField;


public class JSONParserImpl extends JSONSupport implements AJAXParser {
	
	private static final String KEY_JUNBAN = "junban";

	
	@Override
	public Object parse(
			String jsonStr,
			Class<?> clazz,
			Type genericType) {
		Object bean = null;

		if (clazz == null) {
			
			throw new AJAXParserException("No specific class type.");
		}

		ValidationException validationException = new ValidationException();
		try {
			bean = dispatcher(jsonStr, clazz, genericType, validationException);
		} catch (Exception e) {
			if (e instanceof ValidationException) {
				throw (ValidationException) e;
			} else {
				throw new AJAXParserException(e.getMessage());
			}
		}

		
		if (validationException.size() > 0) {
			throw validationException;
		}

		return bean;
	}

	
	protected Object dispatcher(
			String jsonStr,
			Class<?> clazz,
			Type genericType,
			ValidationException validationException) throws JSONException, ParseException, IntrospectionException, IllegalAccessException,
			InstantiationException, InvocationTargetException {
		Object bean = null;

		if (isBasicType(clazz)) {
			
			bean = parseBasic(jsonStr, clazz);
		} else if (isServiceBeanType(clazz)) {
			
			JSONObject jsonObj = new JSONObject(jsonStr);
			bean = parseBean(jsonObj, clazz, validationException);
		} else if (clazz.isArray()) {
			
			JSONArray jsonArr = new JSONArray(jsonStr);
			bean = parseArray(jsonArr, clazz.getComponentType(), validationException);
		} else if (List.class.isAssignableFrom(clazz)) {
			
			JSONArray jsonArr = new JSONArray(jsonStr);
			bean = parseList(jsonArr, clazz, genericType, validationException);
		} else if (Map.class.isAssignableFrom(clazz)) {
			
			JSONObject jsonObj = new JSONObject(jsonStr);
			bean = parseMap(jsonObj, clazz, genericType, validationException);
		} else if (java.lang.Object.class.equals(clazz)) {
			
			bean = (Object) jsonStr;
		} else {
			
			throw new AJAXParserException("unsupport data type [" + clazz + " - " + genericType + "] for json render.");
		}

		return bean;
	}

	
	protected Object parseBean(
			JSONObject jsonObj,
			Class<?> beanClazz,
			ValidationException validationException) throws IntrospectionException, IllegalAccessException, InstantiationException, JSONException,
			InvocationTargetException, ParseException {
		if (beanClazz == null) {
			
			throw new AJAXParserException("No specific class type.");
		}
		if (jsonObj == null) {
			
			return null;
		}

		BeanInfo info = Introspector.getBeanInfo(beanClazz);
		PropertyDescriptor[] propDescriptors = info.getPropertyDescriptors();
		
		Object instance = beanClazz.newInstance();
		for (PropertyDescriptor property : propDescriptors) {
			String name = property.getName();
			Class<?> propClazz = property.getPropertyType();
			if (Class.class.equals(propClazz)) {
				
				continue;
			}

			Method setter = property.getWriteMethod();
			if (setter == null) {
				
				continue;
			}

			if ((propClazz.equals(java.sql.Date.class) || propClazz.equals(java.sql.Time.class) || propClazz.equals(java.sql.Timestamp.class) || propClazz
					.equals(java.util.Date.class)) && jsonObj.containsKey(name)) {
				Object tempValue = jsonObj.get(name);
				if (tempValue != null && StringUtil.isEmpty(tempValue.toString())) {
					tempValue = null;
					jsonObj.put(name, tempValue);
				}
			}

			
			if (validateValue(beanClazz, name, jsonObj, validationException) && jsonObj.containsKey(name)) {
				

				Object nestObj = null;

				
				if (isServiceBeanType(propClazz)) {
					JSONObject jsonObjPropValue = jsonObj.getJSONObject(name);
					nestObj = parseBean(jsonObjPropValue, propClazz, validationException);
				} else if (isBasicType(propClazz)) {
					
					
					Object jsonObjPropValue = jsonObj.get(name);
					nestObj = parseBasic(jsonObjPropValue == null ? null : jsonObjPropValue.toString(), propClazz);
				} else if (propClazz.isArray()) {
					if (jsonObj.get(name) == null) {
						continue;
					}
					JSONArray jsonArrPropValue = jsonObj.getJSONArray(name);
					nestObj = parseArray(jsonArrPropValue, propClazz.getComponentType(), validationException);
				} else if (List.class.isAssignableFrom(propClazz)) {
					if (jsonObj.get(name) == null) {
						continue;
					}
					Type genericType = property.getReadMethod().getGenericReturnType();
					JSONArray jsonArrPropValue = jsonObj.getJSONArray(name);
					nestObj = parseList(jsonArrPropValue, propClazz, genericType, validationException);
				} else if (Map.class.isAssignableFrom(propClazz)) {
					Type genericType = property.getReadMethod().getGenericReturnType();
					JSONObject jsonObjPropValue = jsonObj.getJSONObject(name);
					nestObj = parseMap(jsonObjPropValue, propClazz, genericType, validationException);
				} else if (java.lang.Object.class.equals(propClazz)) {
					
					nestObj = jsonObj.getJSONObject(name);
				} else {
					nestObj = null;
				}

				
				setter.invoke(instance, new Object[] { nestObj });
			}
		}

		return instance;
	}

	
	protected boolean validateValue(
			Class<?> beanClazz,
			String name,
			JSONObject jsonObj,
			ValidationException validationException) throws JSONException {
		boolean rightValue = true;

		try {
			Field field = beanClazz.getDeclaredField(name);
			Annotation[] annotations = field.getDeclaredAnnotations();
			
			ArrayList<Annotation> validators = new ArrayList<Annotation>();
			boolean inputRequired = false;
			for (Annotation annotation : annotations) {
				
				if (AnnotationValidator.isValidationAnnotation(annotation)) {
					validators.add(annotation);
				}
				
				if (!inputRequired) {
					if (annotation instanceof com.maxiaohua.genealogy.fw.core.validator.type.NotNull
							|| annotation instanceof com.maxiaohua.genealogy.fw.core.validator.type.NotEmpty) {
						inputRequired = true;
					} else if (annotation instanceof MultiField) {
						MultiField multiField = (MultiField) annotation;
						if (multiField.validator().equals(com.maxiaohua.genealogy.fw.core.validator.type.NotAllEmpty.class)) {
							inputRequired = true;
						}
					}
				}
			}

			
			boolean sitei = jsonObj.containsKey(name);
			
			if (inputRequired || (sitei && jsonObj.get(name) != null)) {
				
				Collections.sort(validators, new Comparator<Annotation>() {
					public int compare(
							Annotation arg0,
							Annotation arg1) {
						int result = -1;
						try {
							Integer junban0 = (Integer) arg0.getClass().getDeclaredMethod(KEY_JUNBAN).invoke(arg0);
							Integer junban2 = (Integer) arg1.getClass().getDeclaredMethod(KEY_JUNBAN).invoke(arg1);
							result = junban0.compareTo(junban2);
						} catch (NoSuchMethodException nsme) {
							errorLogger.writeErrorLog(nsme.getMessage());
							appLogger.error(nsme.getMessage(), nsme);
							debugLogger.error(nsme.getMessage(), nsme);
						} catch (InvocationTargetException ite) {
							errorLogger.writeErrorLog(ite.getMessage());
							appLogger.error(ite.getMessage(), ite);
							debugLogger.error(ite.getMessage(), ite);

						} catch (IllegalAccessException iae) {
							errorLogger.writeErrorLog(iae.getMessage());
							appLogger.error(iae.getMessage(), iae);
							debugLogger.error(iae.getMessage(), iae);
						}
						return result;
					}
				});

				
				for (Annotation annotation : validators) {
					
					if (annotation instanceof MultiField) {
						MultiField multiField = (MultiField) annotation;
						String[] fieldNames = multiField.others();
						if (fieldNames != null) {
							
							Object[] values = new Object[fieldNames.length + 1];
							if (sitei) {
								values[0] = jsonObj.get(name);
							}
							for (int i = 0; i < fieldNames.length; i++) {
								if (jsonObj.containsKey(fieldNames[i])) {
									values[i + 1] = jsonObj.get(fieldNames[i]);
								}
							}
							
							AnnotationValidator validator = AnnotationValidationUtil.validate(values, annotation);
							
							if (validator != null) {
								
								String errorCode = validator.getErrorCode();
								String fieldBungen = beanClazz.getName() + "." + name;
								Alias alias = (Alias) field.getAnnotation(Alias.class);
								if (alias != null) {
									fieldBungen = alias.value();
								}
								String[] parameters = null;
								String[] ps = validator.getMsgParameters();
								if (ps == null) {
									parameters = new String[2];
									parameters[0] = fieldBungen;
									StringBuffer othersBungen = new StringBuffer();
									for (int i = 0; i < fieldNames.length; i++) {
										try {
											String bungen = beanClazz.getName() + "." + name;
											Field f = beanClazz.getDeclaredField(fieldNames[i]);
											Alias a = (Alias) f.getAnnotation(Alias.class);
											if (a != null) {
												bungen = a.value();
											}
											if (i == 0) {
												othersBungen.append(bungen);
											} else {
												othersBungen.append(",").append(bungen);
											}
										} catch (NoSuchFieldException nsfe) {
											nsfe.printStackTrace();
										}
									}
									parameters[1] = othersBungen.toString();
								} else {
									parameters = new String[ps.length + 1];
									parameters[0] = fieldBungen;
									for (int i = 0; i < ps.length; i++) {
										parameters[i + 1] = ps[i];
									}
								}
								
								validationException.addValidationException(errorCode, parameters, null);
								rightValue = false;
							}
						}
					}
					
					else {
						Object value = null;
						if (sitei) {
							value = jsonObj.get(name);
						}
						
						AnnotationValidator validator = AnnotationValidationUtil.validate(value, annotation);
						
						if (validator != null) {
							
							String errorCode = validator.getErrorCode();
							String fieldBungen = beanClazz.getName() + "." + name;
							Alias alias = (Alias) field.getAnnotation(Alias.class);
							if (alias != null) {
								fieldBungen = alias.value();
							}
							String[] parameters = null;
							String[] ps = validator.getMsgParameters();
							if (ps == null) {
								parameters = new String[] { fieldBungen };
							} else {
								parameters = new String[ps.length + 1];
								parameters[0] = fieldBungen;
								for (int i = 0; i < ps.length; i++) {
									parameters[i + 1] = ps[i];
								}
							}
							
							validationException.addValidationException(errorCode, parameters, null);
							rightValue = false;
						}
					}

					
					if (!rightValue) {
						break;
					}
				}
			}
		} catch (NoSuchFieldException nsfe) {
			
		}

		return rightValue;
	}

	
	protected Object parseBasic(
			String strObj,
			Class<?> clazz) throws ParseException {
		if (clazz == null) {
			throw new AJAXParserException("No specific class type.");
		}

		if (strObj == null) {
			return null;
		}

		
		if (clazz.equals(String.class) || clazz.equals(java.lang.Object.class)) {
			return strObj;
		} else if (clazz.equals(Character.class) || clazz.equals(char.class)) {
			return strObj.charAt(0);
		} else if (clazz.equals(Boolean.class) || clazz.equals(boolean.class)) {
			return Boolean.valueOf(strObj);
		} else if (clazz.equals(Long.class) || clazz.equals(long.class)) {
			return Long.valueOf(strObj);
		} else if (clazz.equals(Integer.class) || clazz.equals(int.class)) {
			return Integer.valueOf(strObj);
		} else if (clazz.equals(Short.class) || clazz.equals(short.class)) {
			return Short.valueOf(strObj);
		} else if (clazz.equals(Double.class) || clazz.equals(double.class)) {
			return Double.valueOf(strObj);
		} else if (clazz.equals(Float.class) || clazz.equals(float.class)) {
			return Float.valueOf(strObj);
		} else if (clazz.equals(Byte.class) || clazz.equals(byte.class)) {
			return Byte.valueOf(strObj);
		} else if (clazz.equals(java.math.BigDecimal.class)) {
			return new java.math.BigDecimal(strObj);
		} else if (clazz.equals(java.math.BigInteger.class)) {
			return new java.math.BigInteger(strObj);
		} else if (clazz.equals(java.sql.Date.class)) {
			return java.sql.Date.valueOf(strObj);
		} else if (clazz.equals(java.sql.Time.class)) {
			return java.sql.Time.valueOf(strObj);
		} else if (clazz.equals(java.sql.Timestamp.class)) {
			return java.sql.Timestamp.valueOf(strObj);
		} else if (clazz.equals(java.util.Date.class)) {
			return defaultUtilDateFormat.parse(strObj);
		} else {
			throw new AJAXParserException("No support class type: " + clazz);
		}
	}

	
	protected Object parseArray(
			JSONArray jsonArr,
			Class<?> elementClazz,
			ValidationException validationException) throws IntrospectionException, IllegalAccessException, InstantiationException, JSONException,
			IllegalArgumentException, InvocationTargetException, ParseException {
		if (elementClazz == null) {
			throw new AJAXParserException("No specific class type.");
		}
		if (jsonArr == null) {
			return null;
		}
		
		Object arrInstance = Array.newInstance(elementClazz, jsonArr.length());
		for (int i = 0; i < jsonArr.length(); i++) {
			
			Object value;
			
			
			Object element = jsonArr.get(i);

			value = dispatcher(element == null ? null : element.toString(), elementClazz, null, validationException);
			Array.set(arrInstance, i, value);
		}
		return arrInstance;
	}

	
	protected Object parseList(
			JSONArray jsonArr,
			Class<?> listClazz,
			Type genericType,
			ValidationException validationException) throws IntrospectionException, IllegalAccessException, InstantiationException, JSONException,
			IllegalArgumentException, InvocationTargetException, ParseException {
		if (listClazz == null) {
			throw new AJAXParserException("No specific class type.");
		}
		if (jsonArr == null) {
			return null;
		}
		if (genericType == null) {
			throw new AJAXParserException("No specific generic type for list " + listClazz);
		}

		
		Type[] actualTypes = getActualTypes(genericType);
		Class<?> elementClazz = actualTypes[0] instanceof Class ? (Class<?>) actualTypes[0] : (Class<?>) ((ParameterizedType) actualTypes[0])
				.getRawType();

		List<Object> listInstance;
		
		if (java.util.ArrayList.class.equals(listClazz)) {
			listInstance = new java.util.ArrayList<Object>(jsonArr.size());
		} else if (java.util.LinkedList.class.equals(listClazz)) {
			listInstance = new java.util.LinkedList<Object>();
		} else {
			
			listInstance = new java.util.ArrayList<Object>(jsonArr.size());
		}
		for (int i = 0; i < jsonArr.length(); i++) {
			
			
			Object element = jsonArr.get(i);

			Object value = dispatcher(element == null ? null : element.toString(), elementClazz, null, validationException);
			listInstance.add(value);
		}
		return listInstance;
	}

	
	protected Object parseMap(
			JSONObject jsonObj,
			Class<?> mapClazz,
			Type genericType,
			ValidationException validationException) throws IntrospectionException, IllegalAccessException, InstantiationException, JSONException,
			IllegalArgumentException, InvocationTargetException, ParseException {
		if (mapClazz == null) {
			throw new AJAXParserException("No specific class type.");
		}
		if (jsonObj == null) {
			return null;
		}
		if (genericType == null) {
			throw new AJAXParserException("No specific generic type for map " + mapClazz);
		}

		Map<Object, Object> mapInstance;
		
		if (java.util.HashMap.class.equals(mapClazz)) {
			mapInstance = new java.util.HashMap<Object, Object>(jsonObj.size());
		} else if (java.util.LinkedHashMap.class.equals(mapClazz)) {
			mapInstance = new java.util.LinkedHashMap<Object, Object>(jsonObj.size());
		} else if (java.util.TreeMap.class.equals(mapClazz)) {
			mapInstance = new java.util.TreeMap<Object, Object>();
		} else if (java.util.Hashtable.class.equals(mapClazz)) {
			mapInstance = new java.util.Hashtable<Object, Object>(jsonObj.size());
		} else {
			
			mapInstance = new java.util.LinkedHashMap<Object, Object>(jsonObj.size());
		}

		Type[] actualTypes = getActualTypes(genericType);
		
		Class<?> keyClazz = actualTypes[0] instanceof Class ? (Class<?>) actualTypes[0] : (Class<?>) ((ParameterizedType) actualTypes[0])
				.getRawType();
		
		Class<?> valueClazz = actualTypes[1] instanceof Class ? (Class<?>) actualTypes[1] : (Class<?>) ((ParameterizedType) actualTypes[1])
				.getRawType();

		for (Object jsonObjKey : jsonObj.keySet()) {
			
			String jsonKey = jsonObjKey.toString();
			Object jsonValue = jsonObj.get(jsonKey);
			String jsonStrValue = jsonValue == null ? null : jsonValue.toString();
			
			Object keyObj = dispatcher(jsonKey, keyClazz, null, validationException);
			
			Object valueObj = dispatcher(jsonStrValue, valueClazz, null, validationException);
			
			mapInstance.put(keyObj, valueObj);
		}

		return mapInstance;
	}
}