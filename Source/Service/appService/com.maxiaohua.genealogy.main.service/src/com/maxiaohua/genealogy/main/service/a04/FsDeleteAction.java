/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsDeleteActionInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsDeleteActionOutDTO;

public class FsDeleteAction extends AbstractService<FsDeleteActionOutDTO, FsDeleteActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsDeleteActionOutDTO execute(
			FsDeleteActionInDTO fsDeleteActionInDTO) {
		FsDeleteActionOutDTO fsDeleteActionOutDTO = new FsDeleteActionOutDTO();
		return fsDeleteActionOutDTO;
	}
}
