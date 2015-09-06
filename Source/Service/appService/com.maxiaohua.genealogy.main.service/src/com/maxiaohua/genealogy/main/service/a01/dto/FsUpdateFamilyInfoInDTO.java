/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.FamilyInfoDTO;

/**
 * 更改家族情况的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("更改家族情况")
public class FsUpdateFamilyInfoInDTO implements java.io.Serializable, Comparable<FsUpdateFamilyInfoInDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 用户ID  
	*/
	@Alias("用户ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String userID = null;

	/**
	* <code>用户ID</code>返回
	* @return <code>用户ID</code>
	*/
	public String getUserID() {
		return this.userID;
	}

	/**
	* <code>userID</code>设定
	* @param userID　<code>userID</code>设定值
	*/
	public void setUserID(
			String userID) {
		this.userID = userID;
	}

	/**
	* 家族信息  
	*/
	@Alias("家族信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private FamilyInfoDTO familyInfo = null;

	/**
	* <code>家族信息</code>返回
	* @return <code>家族信息</code>
	*/
	public FamilyInfoDTO getFamilyInfo() {
		return this.familyInfo;
	}

	/**
	* <code>familyInfo</code>设定
	* @param familyInfo　<code>familyInfo</code>设定值
	*/
	public void setFamilyInfo(
			FamilyInfoDTO familyInfo) {
		this.familyInfo = familyInfo;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdateFamilyInfoInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
