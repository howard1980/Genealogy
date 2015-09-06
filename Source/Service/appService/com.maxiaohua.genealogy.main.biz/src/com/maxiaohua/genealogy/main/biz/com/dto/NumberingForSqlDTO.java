/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;

/**
 * 採番用DTO を格納するDTO
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2013/09/09         GD                  新規作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("採番用DTO")
public class NumberingForSqlDTO extends BaseTableDTO implements java.io.Serializable, Comparable<NumberingForSqlDTO> {
	/**
	* シリアルIDです。
	*/
	private static final long serialVersionUID = 1L;

	/**
	* シーケンスID名  
	*/
	@Alias("採番用DTO・シーケンスID名")
	private String sequenceId = null;

	/**
	* <code>シーケンスID名</code>を戻します。
	* @return <code>シーケンスID名</code>
	*/
	public String getSequenceId() {
		return this.sequenceId;
	}

	/**
	* <code>シーケンスID名</code>を設定します。
	* @param シーケンスID名　<code>シーケンスID名</code>に設定する値
	*/
	public void setSequenceId(
			String sequenceId) {
		this.sequenceId = sequenceId;
	}

	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			NumberingForSqlDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}