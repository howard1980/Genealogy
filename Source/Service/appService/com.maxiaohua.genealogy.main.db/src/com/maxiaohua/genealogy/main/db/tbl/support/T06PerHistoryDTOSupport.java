/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T06PerHistoryDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class T06PerHistoryDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T06_PER_HISTORY_INSERT";

	public static final String FULL_UPDATE = "T06_PER_HISTORY_FULL_UPDATE";

	public static final String UPDATE = "T06_PER_HISTORY_UPDATE";

	public static final String DELETE = "T06_PER_HISTORY_DELETE";

	public static final String FIND = "T06_PER_HISTORY_FIND";

	public static final String FIND_FOR_UPDATE = "T06_PER_HISTORY_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T06_PER_HISTORY_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T06_PER_HISTORY_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T06_PER_HISTORY_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T06_PER_HISTORY_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T06_PER_HISTORY_SQL_SEARCH";

	public static final String COUNT = "T06_PER_HISTORY_COUNT";

	public static final String COUNT_OR = "T06_PER_HISTORY_COUNT_OR";

	public static final String COUNT_SEARCH = "T06_PER_HISTORY_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_EVENT_TYPE = "EVENT_TYPE";

	public static final String COLUMN_EVENT_DATE = "EVENT_DATE";

	public static final String COLUMN_EVENT_TIME = "EVENT_TIME";

	public static final String COLUMN_LATITUDE = "LATITUDE";

	public static final String COLUMN_LONGITUDE = "LONGITUDE";

	public static final String COLUMN_TITLE = "TITLE";

	public static final String COLUMN_COVER_IMAGE = "COVER_IMAGE";

	public static final String COLUMN_PRAISE = "PRAISE";

	public static final String COLUMN_IS_PUBLIC = "IS_PUBLIC";

	public static final String COLUMN_REMARKS = "REMARKS";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String TABLE = "T06_PER_HISTORY";

	public static T06PerHistoryDTO setDefaultValue() {
		T06PerHistoryDTO defaultDTO = new T06PerHistoryDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPerID(0l);

		defaultDTO.setEventType(0);

		defaultDTO.setEventDate(DateUtil.getDefaultDate());

		defaultDTO.setEventTime(DateUtil.getDefaultTime());

		defaultDTO.setLatitude(0.0);

		defaultDTO.setLongitude(0.0);

		defaultDTO.setTitle(StringUtil.EMPTY);

		defaultDTO.setCoverImage(StringUtil.EMPTY);

		defaultDTO.setPraise(0);

		defaultDTO.setIsPublic(0);

		defaultDTO.setRemarks(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
