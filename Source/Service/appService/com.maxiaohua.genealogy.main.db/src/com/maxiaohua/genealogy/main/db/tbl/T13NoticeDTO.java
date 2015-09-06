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
 * 1.0          2015/09/06             TOOL                 Create
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
	private String nOTICE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTICE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date nOTICEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOTICE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time nOTICETIME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lATITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lONGITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date cREATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time cREATETIME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_PER")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long cREATEPER = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public String getNOTICE() {
		return this.nOTICE;
	}

	public void setNOTICE(
			String nOTICE) {
		this.nOTICE = nOTICE;
	}

	public java.sql.Date getNOTICEDATE() {
		return this.nOTICEDATE;
	}

	public void setNOTICEDATE(
			java.sql.Date nOTICEDATE) {
		this.nOTICEDATE = nOTICEDATE;
	}

	public java.sql.Time getNOTICETIME() {
		return this.nOTICETIME;
	}

	public void setNOTICETIME(
			java.sql.Time nOTICETIME) {
		this.nOTICETIME = nOTICETIME;
	}

	public Double getLATITUDE() {
		return this.lATITUDE;
	}

	public void setLATITUDE(
			Double lATITUDE) {
		this.lATITUDE = lATITUDE;
	}

	public Double getLONGITUDE() {
		return this.lONGITUDE;
	}

	public void setLONGITUDE(
			Double lONGITUDE) {
		this.lONGITUDE = lONGITUDE;
	}

	public java.sql.Date getCREATEDATE() {
		return this.cREATEDATE;
	}

	public void setCREATEDATE(
			java.sql.Date cREATEDATE) {
		this.cREATEDATE = cREATEDATE;
	}

	public java.sql.Time getCREATETIME() {
		return this.cREATETIME;
	}

	public void setCREATETIME(
			java.sql.Time cREATETIME) {
		this.cREATETIME = cREATETIME;
	}

	public Long getCREATEPER() {
		return this.cREATEPER;
	}

	public void setCREATEPER(
			Long cREATEPER) {
		this.cREATEPER = cREATEPER;
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

