﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.com.dto;

/**
 * UserInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("用户信息")
public class UserInfoDTO implements java.io.Serializable, Comparable<UserInfoDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String userID = null;

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(
			String userID) {
		this.userID = userID;
	}

	private String familyCode = null;

	public String getFamilyCode() {
		return this.familyCode;
	}

	public void setFamilyCode(
			String familyCode) {
		this.familyCode = familyCode;
	}

	private String name = null;

	public String getName() {
		return this.name;
	}

	public void setName(
			String name) {
		this.name = name;
	}

	private Integer sex = null;

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(
			Integer sex) {
		this.sex = sex;
	}

	private java.sql.Date birthday = null;

	public java.sql.Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(
			java.sql.Date birthday) {
		this.birthday = birthday;
	}

	private String mobile = null;

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	private String maile = null;

	public String getMaile() {
		return this.maile;
	}

	public void setMaile(
			String maile) {
		this.maile = maile;
	}

	private String backPath = null;

	public String getBackPath() {
		return this.backPath;
	}

	public void setBackPath(
			String backPath) {
		this.backPath = backPath;
	}

	private String selfPath = null;

	public String getSelfPath() {
		return this.selfPath;
	}

	public void setSelfPath(
			String selfPath) {
		this.selfPath = selfPath;
	}

	private String[] picture = null;

	public String[] getPicture() {
		return this.picture;
	}

	public void setPicture(
			String[] picture) {
		this.picture = picture;
	}

	private String[] video = null;

	public String[] getVideo() {
		return this.video;
	}

	public void setVideo(
			String[] video) {
		this.video = video;
	}

	private String profile = null;

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(
			String profile) {
		this.profile = profile;
	}

	private AddressInfoDTO address = null;

	public AddressInfoDTO getAddress() {
		return this.address;
	}

	public void setAddress(
			AddressInfoDTO address) {
		this.address = address;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		UserInfoDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
