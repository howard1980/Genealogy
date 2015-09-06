/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * コード値DTO を格納するDTO
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2013/05/06         GD                  新規作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("コード値DTO")
public class CodeWithValueDTO implements java.io.Serializable, Comparable<CodeWithValueDTO> {
	/**
	* シリアルIDです。
	*/
	private static final long serialVersionUID = 1L;

	/**
	* コード  
	*/
	@Alias("コード値DTO・コード")
	private String code = null;
	/**
	* 値  
	*/
	@Alias("コード値DTO・値")
	private String value = null;
	/**
	* 略名  
	*/
	@Alias("コード値DTO・略名")
	private String valueR = null;

	/**
	* <code>コード</code>を戻します。
	* @return <code>コード</code>
	*/
	public String getCode() {
		return this.code;
	}

	/**
	* <code>コード</code>を設定します。
	* @param コード　<code>コード</code>に設定する値
	*/
	public void setCode(
			String code) {
		this.code = code;
	}

	/**
	* <code>値</code>を戻します。
	* @return <code>値</code>
	*/
	public String getValue() {
		return this.value;
	}

	/**
	* <code>値</code>を設定します。
	* @param 値　<code>値</code>に設定する値
	*/
	public void setValue(
			String value) {
		this.value = value;
	}

	/**
	* <code>略名</code>を戻します。
	* @return <code>略名</code>
	*/
	public String getValueR() {
		return this.valueR;
	}

	/**
	* <code>略名</code>を設定します。
	* @param 略名　<code>略名</code>に設定する値
	*/
	public void setValueR(
			String valueR) {
		this.valueR = valueR;
	}

	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			CodeWithValueDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}