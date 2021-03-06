﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a03.dto;

/**
 * NoticeDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("通知数据")
public class NoticeDTO implements java.io.Serializable, Comparable<NoticeDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String noticeID = null;

	public String getNoticeID() {
		return this.noticeID;
	}

	public void setNoticeID(
			String noticeID) {
		this.noticeID = noticeID;
	}

	private java.sql.Date date = null;

	public java.sql.Date getDate() {
		return this.date;
	}

	public void setDate(
			java.sql.Date date) {
		this.date = date;
	}

	private java.sql.Time time = null;

	public java.sql.Time getTime() {
		return this.time;
	}

	public void setTime(
			java.sql.Time time) {
		this.time = time;
	}

	private String distance = null;

	public String getDistance() {
		return this.distance;
	}

	public void setDistance(
			String distance) {
		this.distance = distance;
	}

	private String content = null;

	public String getContent() {
		return this.content;
	}

	public void setContent(
			String content) {
		this.content = content;
	}

	private String userFace = null;

	public String getUserFace() {
		return this.userFace;
	}

	public void setUserFace(
			String userFace) {
		this.userFace = userFace;
	}

	private String userName = null;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(
			String userName) {
		this.userName = userName;
	}

	private String userPhone = null;

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(
			String userPhone) {
		this.userPhone = userPhone;
	}

	private Integer state = null;

	public Integer getState() {
		return this.state;
	}

	public void setState(
			Integer state) {
		this.state = state;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		NoticeDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
