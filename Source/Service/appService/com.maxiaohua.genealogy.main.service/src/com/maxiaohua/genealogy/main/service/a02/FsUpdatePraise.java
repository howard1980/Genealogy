/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a02.dto.FsUpdatePraiseInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.FsUpdatePraiseOutDTO;

public class FsUpdatePraise extends AbstractService<FsUpdatePraiseOutDTO, FsUpdatePraiseInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdatePraiseOutDTO execute(
			FsUpdatePraiseInDTO fsUpdatePraiseInDTO) {
		FsUpdatePraiseOutDTO fsUpdatePraiseOutDTO = new FsUpdatePraiseOutDTO();
		return fsUpdatePraiseOutDTO;
	}
}
