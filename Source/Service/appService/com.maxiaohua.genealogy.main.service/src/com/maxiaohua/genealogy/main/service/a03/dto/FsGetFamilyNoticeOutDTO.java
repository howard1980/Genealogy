/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a03.dto.NoticeDTO;

/**
 * 获得家族事件通告的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族事件通告")
public class FsGetFamilyNoticeOutDTO implements java.io.Serializable, Comparable<FsGetFamilyNoticeOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 通告列表  
	*/
	@Alias("通告列表")
	private NoticeDTO[] noticeArray = null;

	/**
	* <code>通告列表</code>返回
	* @return <code>通告列表</code>
	*/
	public NoticeDTO[] getNoticeArray() {
		return this.noticeArray;
	}

	/**
	* <code>noticeArray</code>设定
	* @param noticeArray　<code>noticeArray</code>设定值
	*/
	public void setNoticeArray(
			NoticeDTO[] noticeArray) {
		this.noticeArray = noticeArray;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetFamilyNoticeOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
