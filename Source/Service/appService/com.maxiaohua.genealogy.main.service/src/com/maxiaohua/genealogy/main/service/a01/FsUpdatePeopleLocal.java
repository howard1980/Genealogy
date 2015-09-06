/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdatePeopleLocalInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdatePeopleLocalOutDTO;

public class FsUpdatePeopleLocal extends AbstractService<FsUpdatePeopleLocalOutDTO, FsUpdatePeopleLocalInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdatePeopleLocalOutDTO execute(
			FsUpdatePeopleLocalInDTO fsUpdatePeopleLocalInDTO) {
		FsUpdatePeopleLocalOutDTO fsUpdatePeopleLocalOutDTO = new FsUpdatePeopleLocalOutDTO();
		return fsUpdatePeopleLocalOutDTO;
	}
}
