/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.CleansmanDTO;

/**
 * 获得用户指定家族意外的族人通讯列表的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得用户指定家族意外的族人通讯列表")
public class FsGetFamilyOtherClansmanOutDTO implements java.io.Serializable, Comparable<FsGetFamilyOtherClansmanOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 族人通讯列表  
	*/
	@Alias("族人通讯列表")
	private CleansmanDTO cleansmen = null;

	/**
	* <code>族人通讯列表</code>返回
	* @return <code>族人通讯列表</code>
	*/
	public CleansmanDTO getCleansmen() {
		return this.cleansmen;
	}

	/**
	* <code>cleansmen</code>设定
	* @param cleansmen　<code>cleansmen</code>设定值
	*/
	public void setCleansmen(
			CleansmanDTO cleansmen) {
		this.cleansmen = cleansmen;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetFamilyOtherClansmanOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
