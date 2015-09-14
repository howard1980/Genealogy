/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T06PerHistoryDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T06_PER_HISTORY")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T06PerHistoryDTO extends T06PerHistoryDTOSupport implements java.io.Serializable, Comparable<T06PerHistoryDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long perID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Integer eventType = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date eventDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time eventTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double latitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double longitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("TITLE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String title = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COVER_IMAGE")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String coverImage = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PRAISE")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer praise = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IS_PUBLIC")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Integer isPublic = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REMARKS")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 4000, max = 4000)
	private String remarks = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(12)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(13)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time createTime = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getPerID() {
		return this.perID;
	}

	public void setPerID(
			Long perID) {
		this.perID = perID;
	}

	public Integer getEventType() {
		return this.eventType;
	}

	public void setEventType(
			Integer eventType) {
		this.eventType = eventType;
	}

	public java.sql.Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(
			java.sql.Date eventDate) {
		this.eventDate = eventDate;
	}

	public java.sql.Time getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(
			java.sql.Time eventTime) {
		this.eventTime = eventTime;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(
			String title) {
		this.title = title;
	}

	public String getCoverImage() {
		return this.coverImage;
	}

	public void setCoverImage(
			String coverImage) {
		this.coverImage = coverImage;
	}

	public Integer getPraise() {
		return this.praise;
	}

	public void setPraise(
			Integer praise) {
		this.praise = praise;
	}

	public Integer getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(
			Integer isPublic) {
		this.isPublic = isPublic;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(
			String remarks) {
		this.remarks = remarks;
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
			T06PerHistoryDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

