package com.maxiaohua.genealogy.main.biz.com.impl;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.main.biz.com.GbPersonal;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;
import com.maxiaohua.genealogy.main.db.constant.SQLID;
import com.maxiaohua.genealogy.main.db.tbl.T02PersonalDTO;
import com.maxiaohua.genealogy.main.db.tbl.T10PerStreamDTO;

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
		personal.setMobile(mobile);
		if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
			createApplicationException(M10050WC);
		}
		
		personal.setLongitude(longitude);
		personal.setLatitude(latitude);
		personal.setRegeditDate(getCurrentDate());
		personal.setRegeditTime(getCurrentTime());
		updateDAO.updateOne(T02PersonalDTO.INSERT, personal, M10190WS, SH_INFO);
		
//		hbJPush.updateCustomerJPush(personal.getID(), registrationID, ismi);
		
		return personal.getID().toString();
	}

	@Override
	public void updateInfo(String userID, String clansmanID, String fisrtName, String lastName, Integer sex, 
			java.sql.Date birthday, java.sql.Time birthTime, String mobile, String maile, String backPath, 
			String selfPath, String[] picture, String[] video, String getProfile){
		T02PersonalDTO personal = new T02PersonalDTO();
		if(userID.equals(clansmanID)){
			personal.setID(Long.parseLong(clansmanID));
			if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
				createApplicationException(M10140CM);
			}
		}
		else{
			personal.setID(Long.parseLong(clansmanID));
			personal.setOwnerID(Long.parseLong(userID));
			if(queryDAO.queryForObject(T02PersonalDTO.EQUAL_SEARCH, personal) != null){
				createApplicationException(M10100CM);
			}
		}

		personal.setFirstName(fisrtName);
		personal.setLastName(lastName);
		personal.setSex(sex);
		personal.setBirthDate(birthday);
		personal.setBirthTime(birthTime);
		personal.setMobile(mobile);
		personal.setMaile(maile);
		personal.setCover(backPath);
		personal.setHeadPortrait(selfPath);
		personal.setInfomation(getProfile);

		this.updateDAO.update(T02PersonalDTO.UPDATE, personal);
		
		T10PerStreamDTO perStreamDTO = new T10PerStreamDTO();
		perStreamDTO.setPerID(personal.getID());
		this.updateDAO.update(SQLID.DELETE_PERSTREAM, perStreamDTO);
		
		for(String item : picture){
			perStreamDTO = new T10PerStreamDTO();
			perStreamDTO.setPerID(personal.getID());
			perStreamDTO.setPath(item);
			perStreamDTO.setType(STREAMTYPE.PICTURE.toString());
			this.updateDAO.update(T10PerStreamDTO.INSERT, perStreamDTO);
		}
		
		for(String item : video){
			perStreamDTO = new T10PerStreamDTO();
			perStreamDTO.setPerID(personal.getID());
			perStreamDTO.setPath(item);
			perStreamDTO.setType(STREAMTYPE.VIDEO.toString());
			this.updateDAO.update(T10PerStreamDTO.INSERT, perStreamDTO);
		}
		
	}
}