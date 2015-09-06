/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.FamileyNoteDTO;

/**
 * 以树的形式获得家族情况的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("以树的形式获得家族情况")
public class FsGetClansmanTreeOutDTO implements java.io.Serializable, Comparable<FsGetClansmanTreeOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 家族树结构  
	*/
	@Alias("家族树结构")
	private FamileyNoteDTO famileyTree = null;

	/**
	* <code>家族树结构</code>返回
	* @return <code>家族树结构</code>
	*/
	public FamileyNoteDTO getFamileyTree() {
		return this.famileyTree;
	}

	/**
	* <code>famileyTree</code>设定
	* @param famileyTree　<code>famileyTree</code>设定值
	*/
	public void setFamileyTree(
			FamileyNoteDTO famileyTree) {
		this.famileyTree = famileyTree;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetClansmanTreeOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
