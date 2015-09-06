/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得App最新版本号的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得App最新版本号")
public class FsGetAppVersionOutDTO implements java.io.Serializable, Comparable<FsGetAppVersionOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 是否更新  
	*/
	@Alias("是否更新")
	private Boolean update = null;

	/**
	* <code>是否更新</code>返回
	* @return <code>是否更新</code>
	*/
	public Boolean getUpdate() {
		return this.update;
	}

	/**
	* <code>update</code>设定
	* @param update　<code>update</code>设定值
	*/
	public void setUpdate(
			Boolean update) {
		this.update = update;
	}

	/**
	* 提示描述  
	*/
	@Alias("提示描述")
	private String descrip = null;

	/**
	* <code>提示描述</code>返回
	* @return <code>提示描述</code>
	*/
	public String getDescrip() {
		return this.descrip;
	}

	/**
	* <code>descrip</code>设定
	* @param descrip　<code>descrip</code>设定值
	*/
	public void setDescrip(
			String descrip) {
		this.descrip = descrip;
	}

	/**
	* 下载地址  
	*/
	@Alias("下载地址")
	private String downloadUrl = null;

	/**
	* <code>下载地址</code>返回
	* @return <code>下载地址</code>
	*/
	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	/**
	* <code>downloadUrl</code>设定
	* @param downloadUrl　<code>downloadUrl</code>设定值
	*/
	public void setDownloadUrl(
			String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetAppVersionOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
