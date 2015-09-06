/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a02.dto.FsGetActionCommentInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.FsGetActionCommentOutDTO;

public class FsGetActionComment extends AbstractService<FsGetActionCommentOutDTO, FsGetActionCommentInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetActionCommentOutDTO execute(
			FsGetActionCommentInDTO fsGetActionCommentInDTO) {
		FsGetActionCommentOutDTO fsGetActionCommentOutDTO = new FsGetActionCommentOutDTO();
		return fsGetActionCommentOutDTO;
	}
}
