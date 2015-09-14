/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.TcomblcmDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("TCOMBLCM")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class TcomblcmDTO extends TcomblcmDTOSupport implements java.io.Serializable, Comparable<TcomblcmDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("APPL_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 3, max = 3)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String applId = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FUNCTION_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 32, max = 32)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String functionId = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ITEM_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 32, max = 32)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String itemId = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VALUE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 32, max = 32)
	private String value = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTES")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1024, max = 1024)
	private String notes = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_OP_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String lastOpId = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date lastDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time lastTime = null;

	public String getApplId() {
		return this.applId;
	}

	public void setApplId(
			String applId) {
		this.applId = applId;
	}

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(
			String functionId) {
		this.functionId = functionId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(
			String itemId) {
		this.itemId = itemId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(
			String value) {
		this.value = value;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(
			String notes) {
		this.notes = notes;
	}

	public String getLastOpId() {
		return this.lastOpId;
	}

	public void setLastOpId(
			String lastOpId) {
		this.lastOpId = lastOpId;
	}

	public java.sql.Date getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(
			java.sql.Date lastDate) {
		this.lastDate = lastDate;
	}

	public java.sql.Time getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(
			java.sql.Time lastTime) {
		this.lastTime = lastTime;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			TcomblcmDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

