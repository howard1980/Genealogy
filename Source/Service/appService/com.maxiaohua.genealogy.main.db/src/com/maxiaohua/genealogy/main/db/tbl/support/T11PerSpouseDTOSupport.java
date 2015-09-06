/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T11PerSpouseDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
public abstract class T11PerSpouseDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T11_PER_SPOUSE_INSERT";

	public static final String FULL_UPDATE = "T11_PER_SPOUSE_FULL_UPDATE";

	public static final String UPDATE = "T11_PER_SPOUSE_UPDATE";

	public static final String DELETE = "T11_PER_SPOUSE_DELETE";

	public static final String FIND = "T11_PER_SPOUSE_FIND";

	public static final String FIND_FOR_UPDATE = "T11_PER_SPOUSE_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T11_PER_SPOUSE_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T11_PER_SPOUSE_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T11_PER_SPOUSE_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T11_PER_SPOUSE_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T11_PER_SPOUSE_SQL_SEARCH";

	public static final String COUNT = "T11_PER_SPOUSE_COUNT";

	public static final String COUNT_OR = "T11_PER_SPOUSE_COUNT_OR";

	public static final String COUNT_SEARCH = "T11_PER_SPOUSE_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_SPO_ID = "SPO_ID";

	public static final String TABLE = "T11_PER_SPOUSE";

	public static T11PerSpouseDTO setDefaultValue() {
		T11PerSpouseDTO defaultDTO = new T11PerSpouseDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPERID(0l);

		defaultDTO.setSPOID(0l);

		return defaultDTO;
	}
}
