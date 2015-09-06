/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.com.dto.FsRegistInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsRegistOutDTO;

public class FsRegist extends AbstractService<FsRegistOutDTO, FsRegistInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsRegistOutDTO execute(
			FsRegistInDTO fsRegistInDTO) {
		FsRegistOutDTO fsRegistOutDTO = new FsRegistOutDTO();
		return fsRegistOutDTO;
	}
}
