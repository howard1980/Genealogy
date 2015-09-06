/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.FsAddFamilyNoticeInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsAddFamilyNoticeOutDTO;

public class FsAddFamilyNotice extends AbstractService<FsAddFamilyNoticeOutDTO, FsAddFamilyNoticeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsAddFamilyNoticeOutDTO execute(
			FsAddFamilyNoticeInDTO fsAddFamilyNoticeInDTO) {
		FsAddFamilyNoticeOutDTO fsAddFamilyNoticeOutDTO = new FsAddFamilyNoticeOutDTO();
		return fsAddFamilyNoticeOutDTO;
	}
}
