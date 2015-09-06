/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetClansmanTreeInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetClansmanTreeOutDTO;

public class FsGetClansmanTree extends AbstractService<FsGetClansmanTreeOutDTO, FsGetClansmanTreeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetClansmanTreeOutDTO execute(
			FsGetClansmanTreeInDTO fsGetClansmanTreeInDTO) {
		FsGetClansmanTreeOutDTO fsGetClansmanTreeOutDTO = new FsGetClansmanTreeOutDTO();
		return fsGetClansmanTreeOutDTO;
	}
}
