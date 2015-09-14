/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T13NoticeDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T13_NOTICE")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T13NoticeDTO extends T13NoticeDTOSupport implements java.io.Serializable, Comparable<T13NoticeDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTICE")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 4000, max = 4000)
	private String notice = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTICE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date noticeDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTICE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time noticeTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double latitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double longitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_PER")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long createPer = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time createTime = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(
			String notice) {
		this.notice = notice;
	}

	public java.sql.Date getNoticeDate() {
		return this.noticeDate;
	}

	public void setNoticeDate(
			java.sql.Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public java.sql.Time getNoticeTime() {
		return this.noticeTime;
	}

	public void setNoticeTime(
			java.sql.Time noticeTime) {
		this.noticeTime = noticeTime;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(
			Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(
			Double longitude) {
		this.longitude = longitude;
	}

	public Long getCreatePer() {
		return this.createPer;
	}

	public void setCreatePer(
			Long createPer) {
		this.createPer = createPer;
	}

	public java.sql.Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(
			java.sql.Date createDate) {
		this.createDate = createDate;
	}

	public java.sql.Time getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(
			java.sql.Time createTime) {
		this.createTime = createTime;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T13NoticeDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

