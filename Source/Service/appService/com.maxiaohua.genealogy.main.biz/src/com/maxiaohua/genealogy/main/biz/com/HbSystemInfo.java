package com.maxiaohua.genealogy.main.biz.com;

import java.util.Map;

import com.maxiaohua.genealogy.main.biz.com.dto.AppVersionDTO;

public interface HbSystemInfo {
	AppVersionDTO getAppVersion(Double version, Integer channel, Integer type);
	
	 Map<String, String>  getOssKey();
}