/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a04.dto;

/**
 * SettingInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族足迹数据")
public class SettingInfoDTO implements java.io.Serializable, Comparable<SettingInfoDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private Boolean value1 = null;

	public Boolean getValue1() {
		return this.value1;
	}

	public void setValue1(
			Boolean value1) {
		this.value1 = value1;
	}

	private Boolean value2 = null;

	public Boolean getValue2() {
		return this.value2;
	}

	public void setValue2(
			Boolean value2) {
		this.value2 = value2;
	}

	private Boolean value3 = null;

	public Boolean getValue3() {
		return this.value3;
	}

	public void setValue3(
			Boolean value3) {
		this.value3 = value3;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		SettingInfoDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
