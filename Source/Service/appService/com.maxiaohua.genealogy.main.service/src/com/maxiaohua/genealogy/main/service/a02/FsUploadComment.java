/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a02.dto.FsUploadCommentInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.FsUploadCommentOutDTO;

public class FsUploadComment extends AbstractService<FsUploadCommentOutDTO, FsUploadCommentInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUploadCommentOutDTO execute(
			FsUploadCommentInDTO fsUploadCommentInDTO) {
		FsUploadCommentOutDTO fsUploadCommentOutDTO = new FsUploadCommentOutDTO();
		return fsUploadCommentOutDTO;
	}
}
