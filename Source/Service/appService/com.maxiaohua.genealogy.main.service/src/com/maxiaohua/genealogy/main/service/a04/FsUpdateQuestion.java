/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateQuestionInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateQuestionOutDTO;

public class FsUpdateQuestion extends AbstractService<FsUpdateQuestionOutDTO, FsUpdateQuestionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdateQuestionOutDTO execute(
			FsUpdateQuestionInDTO fsUpdateQuestionInDTO) {
		FsUpdateQuestionOutDTO fsUpdateQuestionOutDTO = new FsUpdateQuestionOutDTO();
		return fsUpdateQuestionOutDTO;
	}
}
