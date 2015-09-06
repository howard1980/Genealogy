/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetCleansmanListInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetCleansmanListOutDTO;

public class FsGetCleansmanList extends AbstractService<FsGetCleansmanListOutDTO, FsGetCleansmanListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetCleansmanListOutDTO execute(
			FsGetCleansmanListInDTO fsGetCleansmanListInDTO) {
		FsGetCleansmanListOutDTO fsGetCleansmanListOutDTO = new FsGetCleansmanListOutDTO();
		return fsGetCleansmanListOutDTO;
	}
}
