package com.maxiaohua.genealogy.main.biz.a01.impl;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.main.biz.a01.GbFamily;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;
import com.maxiaohua.genealogy.main.db.tbl.T01GenealogyDTO;

public class GbFamilyImpl extends AbstractDBLogic implements GbFamily, HbMessageCode, CommonConstant, 
		CtgCodeConstant {
	protected static final String SH_INFO = "家族情报表";

	@Override
	public void add(String userID, String arms, String famileyName, 
			String introductionText) {
		T01GenealogyDTO genealogyDTO = new T01GenealogyDTO();
		genealogyDTO.setArms(arms);
		genealogyDTO.setFirstName(famileyName);
		genealogyDTO.setInfomation(introductionText);
		genealogyDTO.setOwnerID(Long.parseLong(userID));
		this.updateDAO.update(T01GenealogyDTO.INSERT, genealogyDTO);
	}

}