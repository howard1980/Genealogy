/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.com.impl;

import java.util.List;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.fw.core.util.CollectionUtil;
import com.maxiaohua.genealogy.main.biz.com.HbComblcmMaster;
import com.maxiaohua.genealogy.main.biz.com.HbMasterCache;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;
import com.maxiaohua.genealogy.main.biz.constant.MasterCacheConstant.MASTER_NAME;
import com.maxiaohua.genealogy.main.db.tbl.TcomblcmDTO;

/**
 * ビジネスロジック設定マスター Bizロジックの実装クラス
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2013/08/16         GD 王勇             新規作成
 *
 */
public class HbComblcmMasterImpl extends AbstractDBLogic implements HbComblcmMaster, HbMessageCode {

	/**
	 * TCOMBLCM：ビジネスロジック設定マスター
	 */
	private static final String MSG_PARAM_TCOMBLCM = "TCOMBLCM：业务逻辑设定 字典";

	/**
	 * マスターキャッシュ Bizロジック
	 */
	@AutoInject
	protected HbMasterCache hbMasterCache;

	/* (non-Javadoc)
	 * @see com.maxiaohua.genealogy.main.biz.com.HbComblcmMaster#getComblcmInfo(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public TcomblcmDTO getComblcmInfo(
			String applId,
			String functionId,
			String itemId) {

		//ビジネスロジック設定マスター情報を検索する
		List<TcomblcmDTO> tcomblcmDTOs = hbMasterCache.getMasterData(MASTER_NAME.TCOMBLCM, applId, functionId, itemId);

		if (CollectionUtil.isEmpty(tcomblcmDTOs)) {
			//1件も取得できなかった場合は、「ApplicationException」を返す
			createApplicationException(M10440WS, MSG_PARAM_TCOMBLCM);
		}

		//ビジネスロジック設定マスター情報を返す
		return tcomblcmDTOs.get(0);
	}
}
