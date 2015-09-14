/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T04GenHistoryDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class T04GenHistoryDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T04_GEN_HISTORY_INSERT";

	public static final String FULL_UPDATE = "T04_GEN_HISTORY_FULL_UPDATE";

	public static final String UPDATE = "T04_GEN_HISTORY_UPDATE";

	public static final String DELETE = "T04_GEN_HISTORY_DELETE";

	public static final String FIND = "T04_GEN_HISTORY_FIND";

	public static final String FIND_FOR_UPDATE = "T04_GEN_HISTORY_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T04_GEN_HISTORY_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T04_GEN_HISTORY_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T04_GEN_HISTORY_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T04_GEN_HISTORY_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T04_GEN_HISTORY_SQL_SEARCH";

	public static final String COUNT = "T04_GEN_HISTORY_COUNT";

	public static final String COUNT_OR = "T04_GEN_HISTORY_COUNT_OR";

	public static final String COUNT_SEARCH = "T04_GEN_HISTORY_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String TABLE = "T04_GEN_HISTORY";

	public static T04GenHistoryDTO setDefaultValue() {
		T04GenHistoryDTO defaultDTO = new T04GenHistoryDTO();

		defaultDTO.setID(0l);

		return defaultDTO;
	}
}
