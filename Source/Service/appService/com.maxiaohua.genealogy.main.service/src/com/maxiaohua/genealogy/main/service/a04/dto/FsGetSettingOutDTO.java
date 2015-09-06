/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a04.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a04.dto.SettingInfoDTO;

/**
 * 获得用户设定的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得用户设定")
public class FsGetSettingOutDTO implements java.io.Serializable, Comparable<FsGetSettingOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 用户设定情况  
	*/
	@Alias("用户设定情况")
	private SettingInfoDTO settingInfo = null;

	/**
	* <code>用户设定情况</code>返回
	* @return <code>用户设定情况</code>
	*/
	public SettingInfoDTO getSettingInfo() {
		return this.settingInfo;
	}

	/**
	* <code>settingInfo</code>设定
	* @param settingInfo　<code>settingInfo</code>设定值
	*/
	public void setSettingInfo(
			SettingInfoDTO settingInfo) {
		this.settingInfo = settingInfo;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetSettingOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
