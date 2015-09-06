/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T05GenHistoryInfoDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
public abstract class T05GenHistoryInfoDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T05_GEN_HISTORY_INFO_INSERT";

	public static final String FULL_UPDATE = "T05_GEN_HISTORY_INFO_FULL_UPDATE";

	public static final String UPDATE = "T05_GEN_HISTORY_INFO_UPDATE";

	public static final String DELETE = "T05_GEN_HISTORY_INFO_DELETE";

	public static final String FIND = "T05_GEN_HISTORY_INFO_FIND";

	public static final String FIND_FOR_UPDATE = "T05_GEN_HISTORY_INFO_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T05_GEN_HISTORY_INFO_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T05_GEN_HISTORY_INFO_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T05_GEN_HISTORY_INFO_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T05_GEN_HISTORY_INFO_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T05_GEN_HISTORY_INFO_SQL_SEARCH";

	public static final String COUNT = "T05_GEN_HISTORY_INFO_COUNT";

	public static final String COUNT_OR = "T05_GEN_HISTORY_INFO_COUNT_OR";

	public static final String COUNT_SEARCH = "T05_GEN_HISTORY_INFO_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String TABLE = "T05_GEN_HISTORY_INFO";

	public static T05GenHistoryInfoDTO setDefaultValue() {
		T05GenHistoryInfoDTO defaultDTO = new T05GenHistoryInfoDTO();

		defaultDTO.setID(0l);

		return defaultDTO;
	}
}
