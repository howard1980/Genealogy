/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a04.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 更改手机号的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("更改手机号")
public class FsUpdatePhoneInDTO implements java.io.Serializable, Comparable<FsUpdatePhoneInDTO> {
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
	* 手机号  
	*/
	@Alias("手机号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String mobile = null;

	/**
	* <code>手机号</code>返回
	* @return <code>手机号</code>
	*/
	public String getMobile() {
		return this.mobile;
	}

	/**
	* <code>mobile</code>设定
	* @param mobile　<code>mobile</code>设定值
	*/
	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	/**
	* 验证码  
	*/
	@Alias("验证码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String validCode = null;

	/**
	* <code>验证码</code>返回
	* @return <code>验证码</code>
	*/
	public String getValidCode() {
		return this.validCode;
	}

	/**
	* <code>validCode</code>设定
	* @param validCode　<code>validCode</code>设定值
	*/
	public void setValidCode(
			String validCode) {
		this.validCode = validCode;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdatePhoneInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
