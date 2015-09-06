/* Genealogy
* (C) Copyright maxiaohua , Ltd. 2014, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.com;

import com.maxiaohua.genealogy.main.biz.com.dto.CodeWithValueDTO;
import com.maxiaohua.genealogy.main.biz.constant.MasterCacheConstant;

public interface HbMasterCache {


	public <E> E getMasterData(
			MasterCacheConstant.MASTER_NAME name,
			Object... parameters);

	public void refreshMasterData(
			MasterCacheConstant.MASTER_NAME name);

	public void loadMasterData(
			MasterCacheConstant.MASTER_NAME name);
	
	public CodeWithValueDTO[] getMasterList(
			MasterCacheConstant.MASTER_NAME name);

}