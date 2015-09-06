/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdateFamilyInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdateFamilyInfoOutDTO;

public class FsUpdateFamilyInfo extends AbstractService<FsUpdateFamilyInfoOutDTO, FsUpdateFamilyInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdateFamilyInfoOutDTO execute(
			FsUpdateFamilyInfoInDTO fsUpdateFamilyInfoInDTO) {
		FsUpdateFamilyInfoOutDTO fsUpdateFamilyInfoOutDTO = new FsUpdateFamilyInfoOutDTO();
		return fsUpdateFamilyInfoOutDTO;
	}
}
