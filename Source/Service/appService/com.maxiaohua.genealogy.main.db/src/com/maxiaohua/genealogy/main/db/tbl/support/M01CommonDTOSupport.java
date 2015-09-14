/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.M01CommonDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class M01CommonDTOSupport extends BaseTableDTO {

	public static final String INSERT = "M01_COMMON_INSERT";

	public static final String FULL_UPDATE = "M01_COMMON_FULL_UPDATE";

	public static final String UPDATE = "M01_COMMON_UPDATE";

	public static final String DELETE = "M01_COMMON_DELETE";

	public static final String FIND = "M01_COMMON_FIND";

	public static final String FIND_FOR_UPDATE = "M01_COMMON_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "M01_COMMON_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "M01_COMMON_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "M01_COMMON_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "M01_COMMON_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "M01_COMMON_SQL_SEARCH";

	public static final String COUNT = "M01_COMMON_COUNT";

	public static final String COUNT_OR = "M01_COMMON_COUNT_OR";

	public static final String COUNT_SEARCH = "M01_COMMON_COUNT_SEARCH";

	public static final String COLUMN_CODE1 = "CODE1";

	public static final String COLUMN_CODE2 = "CODE2";

	public static final String COLUMN_CODE3 = "CODE3";

	public static final String COLUMN_VALUE = "VALUE";

	public static final String TABLE = "M01_COMMON";

	public static M01CommonDTO setDefaultValue() {
		M01CommonDTO defaultDTO = new M01CommonDTO();

		defaultDTO.setCODE1(StringUtil.EMPTY);

		defaultDTO.setCODE2(StringUtil.EMPTY);

		defaultDTO.setCODE3(StringUtil.EMPTY);

		defaultDTO.setVALUE(StringUtil.EMPTY);

		return defaultDTO;
	}
}
