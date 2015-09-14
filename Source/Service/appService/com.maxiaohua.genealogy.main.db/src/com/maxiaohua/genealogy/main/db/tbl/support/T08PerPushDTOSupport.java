/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T08PerPushDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
public abstract class T08PerPushDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T08_PER_PUSH_INSERT";

	public static final String FULL_UPDATE = "T08_PER_PUSH_FULL_UPDATE";

	public static final String UPDATE = "T08_PER_PUSH_UPDATE";

	public static final String DELETE = "T08_PER_PUSH_DELETE";

	public static final String FIND = "T08_PER_PUSH_FIND";

	public static final String FIND_FOR_UPDATE = "T08_PER_PUSH_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T08_PER_PUSH_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T08_PER_PUSH_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T08_PER_PUSH_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T08_PER_PUSH_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T08_PER_PUSH_SQL_SEARCH";

	public static final String COUNT = "T08_PER_PUSH_COUNT";

	public static final String COUNT_OR = "T08_PER_PUSH_COUNT_OR";

	public static final String COUNT_SEARCH = "T08_PER_PUSH_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_REGISITRATIONID = "REGISITRATIONID";

	public static final String COLUMN_IMSI = "IMSI";

	public static final String TABLE = "T08_PER_PUSH";

	public static T08PerPushDTO setDefaultValue() {
		T08PerPushDTO defaultDTO = new T08PerPushDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPERID(0l);

		defaultDTO.setRegisitrationID(StringUtil.EMPTY);

		defaultDTO.setIMSI(0);

		return defaultDTO;
	}
}
