﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T12PerHisCommentDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T12_PER_HIS_COMMENT")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T12PerHisCommentDTO extends T12PerHisCommentDTOSupport implements java.io.Serializable, Comparable<T12PerHisCommentDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("HIS_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long hisID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long perID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COMMENT")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String comment = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getHisID() {
		return this.hisID;
	}

	public void setHisID(
			Long hisID) {
		this.hisID = hisID;
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

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T12PerHisCommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

