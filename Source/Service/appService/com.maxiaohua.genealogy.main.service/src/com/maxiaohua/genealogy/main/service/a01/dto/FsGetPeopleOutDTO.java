﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * 获得族人信息的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得族人信息")
public class FsGetPeopleOutDTO implements java.io.Serializable, Comparable<FsGetPeopleOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 族人信息  
	*/
	@Alias("族人信息")
	private UserInfoDTO userInfo = null;

	/**
	* <code>族人信息</code>返回
	* @return <code>族人信息</code>
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

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetPeopleOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
