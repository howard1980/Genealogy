/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.FsAttentionNoticeInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsAttentionNoticeOutDTO;

public class FsAttentionNotice extends AbstractService<FsAttentionNoticeOutDTO, FsAttentionNoticeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsAttentionNoticeOutDTO execute(
			FsAttentionNoticeInDTO fsAttentionNoticeInDTO) {
		FsAttentionNoticeOutDTO fsAttentionNoticeOutDTO = new FsAttentionNoticeOutDTO();
		return fsAttentionNoticeOutDTO;
	}
}
