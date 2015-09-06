/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateActionInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateActionOutDTO;

public class FsUpdateAction extends AbstractService<FsUpdateActionOutDTO, FsUpdateActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdateActionOutDTO execute(
			FsUpdateActionInDTO fsUpdateActionInDTO) {
		FsUpdateActionOutDTO fsUpdateActionOutDTO = new FsUpdateActionOutDTO();
		return fsUpdateActionOutDTO;
	}
}
