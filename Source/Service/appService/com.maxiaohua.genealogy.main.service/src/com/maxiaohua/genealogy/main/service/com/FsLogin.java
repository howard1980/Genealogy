/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.com.dto.FsLoginInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsLoginOutDTO;

public class FsLogin extends AbstractService<FsLoginOutDTO, FsLoginInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsLoginOutDTO execute(
			FsLoginInDTO fsLoginInDTO) {
		FsLoginOutDTO fsLoginOutDTO = new FsLoginOutDTO();
		return fsLoginOutDTO;
	}
}
