/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsAddActionInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsAddActionOutDTO;

public class FsAddAction extends AbstractService<FsAddActionOutDTO, FsAddActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsAddActionOutDTO execute(
			FsAddActionInDTO fsAddActionInDTO) {
		FsAddActionOutDTO fsAddActionOutDTO = new FsAddActionOutDTO();
		return fsAddActionOutDTO;
	}
}
