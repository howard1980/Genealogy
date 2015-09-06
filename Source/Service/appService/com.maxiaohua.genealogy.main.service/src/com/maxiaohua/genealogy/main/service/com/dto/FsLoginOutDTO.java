/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;
import com.maxiaohua.genealogy.main.biz.a01.dto.FamilyInfoDTO;

/**
 * 登录的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("登录")
public class FsLoginOutDTO implements java.io.Serializable, Comparable<FsLoginOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 用户信息  
	*/
	@Alias("用户信息")
	private UserInfoDTO userInfo = null;

	/**
	* <code>用户信息</code>返回
	* @return <code>用户信息</code>
	*/
	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	/**
	* <code>userInfo</code>设定
	* @param userInfo　<code>userInfo</code>设定值
	*/
	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	/**
	* 家族信息  
	*/
	@Alias("家族信息")
	private FamilyInfoDTO[] familyInfoArray = null;

	/**
	* <code>家族信息</code>返回
	* @return <code>家族信息</code>
	*/
	public FamilyInfoDTO[] getFamilyInfoArray() {
		return this.familyInfoArray;
	}

	/**
	* <code>familyInfoArray</code>设定
	* @param familyInfoArray　<code>familyInfoArray</code>设定值
	*/
	public void setFamilyInfoArray(
			FamilyInfoDTO[] familyInfoArray) {
		this.familyInfoArray = familyInfoArray;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsLoginOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
