/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.FsCommentNoticeInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsCommentNoticeOutDTO;

public class FsCommentNotice extends AbstractService<FsCommentNoticeOutDTO, FsCommentNoticeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsCommentNoticeOutDTO execute(
			FsCommentNoticeInDTO fsCommentNoticeInDTO) {
		FsCommentNoticeOutDTO fsCommentNoticeOutDTO = new FsCommentNoticeOutDTO();
		return fsCommentNoticeOutDTO;
	}
}
