/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T17PerQuestionDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T17_PER_QUESTION")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T17PerQuestionDTO extends T17PerQuestionDTOSupport implements java.io.Serializable, Comparable<T17PerQuestionDTO> {

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

	@com.maxiaohua.genealogy.fw.core.type.Alias("QUESTION")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String question = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("STATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String state = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time createTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("UPDATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Timestamp updateDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("UPDATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time updateTime = null;

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

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(
			String question) {
		this.question = question;
	}

	public String getState() {
		return this.state;
	}

	public void setState(
			String state) {
		this.state = state;
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

	public java.sql.Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(
			java.sql.Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public java.sql.Time getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(
			java.sql.Time updateTime) {
		this.updateTime = updateTime;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T17PerQuestionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

