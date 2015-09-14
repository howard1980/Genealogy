package com.maxiaohua.genealogy.main.biz.com;

public interface GbPersonal {
	String regist(String mobile, String validCode, 
			Double longitude, Double latitude, String registrationID,Integer ismi);
	
	void updateInfo(String userID, String clansmanID, String fisrtName, String lastName, Integer sex, 
			java.sql.Date birthday, java.sql.Time birthTime, String mobile, String maile, String backPath, 
			String selfPath, String[] picture, String[] video, String getProfile);
}
