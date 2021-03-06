﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsAddFamilyInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsAddFamilyInfoOutDTO;

public class FsAddFamilyInfo extends AbstractService<FsAddFamilyInfoOutDTO, FsAddFamilyInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsAddFamilyInfoOutDTO execute(
			FsAddFamilyInfoInDTO fsAddFamilyInfoInDTO) {
		FsAddFamilyInfoOutDTO fsAddFamilyInfoOutDTO = new FsAddFamilyInfoOutDTO();
		return fsAddFamilyInfoOutDTO;
	}
}
