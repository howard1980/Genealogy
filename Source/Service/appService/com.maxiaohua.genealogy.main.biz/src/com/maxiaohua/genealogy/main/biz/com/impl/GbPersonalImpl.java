package com.maxiaohua.genealogy.main.biz.com.impl;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.main.biz.com.GbPersonal;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;
import com.maxiaohua.genealogy.main.db.tbl.T02PersonalDTO;

public class GbPersonalImpl extends AbstractDBLogic implements GbPersonal, HbMessageCode, CommonConstant, 
		CtgCodeConstant {
	protected static final String SH_INFO = "个人情报表";
	
//	@AutoInject
//	private HbJPush hbJPush;
	
	public String regist(String mobile, String validCode, 
			Double longitude, Double latitude, String registrationID,Integer ismi){
		String code = null;
		code = queryKeyValue.queryForString(mobile);
		if(code == null || !code.equals(validCode)){
			createApplicationException(M10640WS);
		}
		
		T02PersonalDTO personal = new T02PersonalDTO();
		personal.setMOBILE(mobile);
		if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
			createApplicationException(M10050WC);
		}
		
		personal.setLONGITUDE(longitude);
		personal.setLATITUDE(latitude);
		personal.setREGEDITDATE(getCurrentDate());
		personal.setREGEDITTIME(getCurrentTime());
		updateDAO.updateOne(T02PersonalDTO.INSERT, personal, M10190WS, SH_INFO);
		
//		hbJPush.updateCustomerJPush(personal.getID(), registrationID, ismi);
		
		return personal.getID().toString();
	}

	@Override
	public void updateInfo(String userID, UserInfoDTO userInfo) {
		T02PersonalDTO personal = new T02PersonalDTO();
		if(userID.equals(userInfo.getUserID())){
			personal.setID(Long.parseLong(userInfo.getUserID()));
			if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
				createApplicationException(M10140CM);
			}
		}
		else{
			personal.setID(Long.parseLong(userInfo.getUserID()));
			personal.setOWNERID(Long.parseLong(userID));
			if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
				createApplicationException(M10100CM);
			}
		}

		personal.setFIRSTNAME(userInfo.getFisrtName());
		personal.setLASTNAME(userInfo.getLastName());
		personal.setSEX(userInfo.getSex());
		personal.setBIRTHDATE(userInfo.getBirthday());
		personal.setMOBILE(userInfo.getMobile());
		personal.setMAILE(userInfo.getMaile());
		personal.setCOVER(userInfo.getBackPath());
		personal.setHEADPORTRAIT(userInfo.getSelfPath());
		personal.setINFOMATION(userInfo.getProfile());

		this.updateDAO.update(T02PersonalDTO.UPDATE, personal);
	}
}