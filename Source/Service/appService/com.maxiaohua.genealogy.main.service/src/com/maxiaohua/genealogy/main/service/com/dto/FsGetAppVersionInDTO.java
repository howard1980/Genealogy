/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得App最新版本号的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得App最新版本号")
public class FsGetAppVersionInDTO implements java.io.Serializable, Comparable<FsGetAppVersionInDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 版本信息  
	*/
	@Alias("版本信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Double version = null;

	/**
	* <code>版本信息</code>返回
	* @return <code>版本信息</code>
	*/
	public Double getVersion() {
		return this.version;
	}

	/**
	* <code>version</code>设定
	* @param version　<code>version</code>设定值
	*/
	public void setVersion(
			Double version) {
		this.version = version;
	}

	/**
	* 渠道号  
	*/
	@Alias("渠道号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer channel = null;

	/**
	* <code>渠道号</code>返回
	* @return <code>渠道号</code>
	*/
	public Integer getChannel() {
		return this.channel;
	}

	/**
	* <code>channel</code>设定
	* @param channel　<code>channel</code>设定值
	*/
	public void setChannel(
			Integer channel) {
		this.channel = channel;
	}

	/**
	* 类型  
	*/
	@Alias("类型")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer type = null;

	/**
	* <code>类型</code>返回
	* @return <code>类型</code>
	*/
	public Integer getType() {
		return this.type;
	}

	/**
	* <code>type</code>设定
	* @param type　<code>type</code>设定值
	*/
	public void setType(
			Integer type) {
		this.type = type;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetAppVersionInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
