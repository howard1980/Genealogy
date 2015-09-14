/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T16NoticeCommentDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T16_NOTICE_COMMENT")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T16NoticeCommentDTO extends T16NoticeCommentDTOSupport implements java.io.Serializable, Comparable<T16NoticeCommentDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOT_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long notID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long perID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COMMENT")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String comment = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time createTime = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getNotID() {
		return this.notID;
	}

	public void setNotID(
			Long notID) {
		this.notID = notID;
	}

	public Long getPerID() {
		return this.perID;
	}

	public void setPerID(
			Long perID) {
		this.perID = perID;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(
			String comment) {
		this.comment = comment;
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
			T16NoticeCommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

