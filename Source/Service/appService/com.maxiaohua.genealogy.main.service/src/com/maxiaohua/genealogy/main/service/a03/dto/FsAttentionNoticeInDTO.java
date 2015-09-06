/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 设定对家族事件的关注的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("设定对家族事件的关注")
public class FsAttentionNoticeInDTO implements java.io.Serializable, Comparable<FsAttentionNoticeInDTO> {
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
	* 通告ID  
	*/
	@Alias("通告ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String noticeID = null;

	/**
	* <code>通告ID</code>返回
	* @return <code>通告ID</code>
	*/
	public String getNoticeID() {
		return this.noticeID;
	}

	/**
	* <code>noticeID</code>设定
	* @param noticeID　<code>noticeID</code>设定值
	*/
	public void setNoticeID(
			String noticeID) {
		this.noticeID = noticeID;
	}

	/**
	* 状态  
	*/
	@Alias("状态")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer state = null;

	/**
	* <code>状态</code>返回
	* @return <code>状态</code>
	*/
	public Integer getState() {
		return this.state;
	}

	/**
	* <code>state</code>设定
	* @param state　<code>state</code>设定值
	*/
	public void setState(
			Integer state) {
		this.state = state;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsAttentionNoticeInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
