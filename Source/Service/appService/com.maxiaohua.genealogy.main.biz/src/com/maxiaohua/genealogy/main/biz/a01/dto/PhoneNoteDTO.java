/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

/**
 * PhoneNoteDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("电话本信息")
public class PhoneNoteDTO implements java.io.Serializable, Comparable<PhoneNoteDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String name = null;

	public String getName() {
		return this.name;
	}

	public void setName(
			String name) {
		this.name = name;
	}

	private String phone = null;

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(
			String phone) {
		this.phone = phone;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		PhoneNoteDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
