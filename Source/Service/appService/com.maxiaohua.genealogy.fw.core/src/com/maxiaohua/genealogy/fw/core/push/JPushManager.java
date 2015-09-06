package com.maxiaohua.genealogy.fw.core.push;

import java.util.Map;


public interface JPushManager {
	
	boolean sendByRegisitrationIDToWorker(String msg,Map<String,String> extras, String... regisitrationIDs);
	boolean sendByRegisitrationID(String msg, Map<String,String> extras, Integer imsi, String... regisitrationIDs);
	boolean sendByTags(String msg, String... tags);//
	boolean sendByAlias(String msg, String prefix, String... alias);
	boolean sendAll(String msg);
	
}
