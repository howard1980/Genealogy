/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.M01CommonDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("M01_COMMON")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class M01CommonDTO extends M01CommonDTOSupport implements java.io.Serializable, Comparable<M01CommonDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE1")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String cODE1 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE2")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String cODE2 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE3")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String cODE3 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VALUE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 40, max = 40)
	private String vALUE = null;

	public String getCODE1() {
		return this.cODE1;
	}

	public void setCODE1(
			String cODE1) {
		this.cODE1 = cODE1;
	}

	public String getCODE2() {
		return this.cODE2;
	}

	public void setCODE2(
			String cODE2) {
		this.cODE2 = cODE2;
	}

	public String getCODE3() {
		return this.cODE3;
	}

	public void setCODE3(
			String cODE3) {
		this.cODE3 = cODE3;
	}

	public String getVALUE() {
		return this.vALUE;
	}

	public void setVALUE(
			String vALUE) {
		this.vALUE = vALUE;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			M01CommonDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

