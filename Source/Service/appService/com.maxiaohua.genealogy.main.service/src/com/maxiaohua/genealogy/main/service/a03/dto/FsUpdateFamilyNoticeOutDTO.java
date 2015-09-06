/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;


/**
 * 修改家族事件通告的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("修改家族事件通告")
public class FsUpdateFamilyNoticeOutDTO implements java.io.Serializable, Comparable<FsUpdateFamilyNoticeOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdateFamilyNoticeOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
