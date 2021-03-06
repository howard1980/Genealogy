package com.maxiaohua.genealogy.main.biz.com.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.fw.core.util.CollectionUtil;
import com.maxiaohua.genealogy.main.biz.com.HbSystemInfo;
import com.maxiaohua.genealogy.main.biz.com.dto.AppVersionDTO;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;
import com.maxiaohua.genealogy.main.db.tbl.M02SystemVersionDTO;

public class HbSystemInfoImpl extends AbstractDBLogic implements HbSystemInfo,
		HbMessageCode, CommonConstant, CtgCodeConstant {

	@Override
	public AppVersionDTO getAppVersion(Double version, Integer channel,
			Integer type) {
		AppVersionDTO appVersion = new AppVersionDTO();
		
		M02SystemVersionDTO systemVersionSearch = new M02SystemVersionDTO();
		systemVersionSearch.setDELFLG(Integer.parseInt(DELETE_FLG.NO_DELETED.toString()));
		systemVersionSearch.setIMSI(type);

		List<M02SystemVersionDTO> versionArray = this.queryDAO.queryForObjectList(
				M02SystemVersionDTO.EQUAL_SEARCH, systemVersionSearch);
		
		if (CollectionUtil.isNotEmpty(versionArray)) {
			if(versionArray.get(0).getVERSION() == version){
				appVersion.setUpdate(false);
			}
			else{
				appVersion.setUpdate(true);
				appVersion.setDownloadUrl(versionArray.get(0).getLOADPATH());
				appVersion.setDescrip(versionArray.get(0).getDESCRIP());
			}
		}
		else{
			super.createApplicationException(M10010WS);
		}

		return appVersion;
	}

	@Override
	public Map<String, String> getOssKey() {

		Map<String, String> result = new HashMap<String, String>();

		result.put("ak", "G519MH7jgh3uuBUJ");
		result.put("sk", "9wdW5xOupatJiQzY4sLq8TcErg2y4N");
		result.put("bucketname", "sxxc001");

		return result;
	}

}