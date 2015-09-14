/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T14NoticePraiseDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class T14NoticePraiseDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T14_NOTICE_PRAISE_INSERT";

	public static final String FULL_UPDATE = "T14_NOTICE_PRAISE_FULL_UPDATE";

	public static final String UPDATE = "T14_NOTICE_PRAISE_UPDATE";

	public static final String DELETE = "T14_NOTICE_PRAISE_DELETE";

	public static final String FIND = "T14_NOTICE_PRAISE_FIND";

	public static final String FIND_FOR_UPDATE = "T14_NOTICE_PRAISE_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T14_NOTICE_PRAISE_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T14_NOTICE_PRAISE_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T14_NOTICE_PRAISE_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T14_NOTICE_PRAISE_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T14_NOTICE_PRAISE_SQL_SEARCH";

	public static final String COUNT = "T14_NOTICE_PRAISE_COUNT";

	public static final String COUNT_OR = "T14_NOTICE_PRAISE_COUNT_OR";

	public static final String COUNT_SEARCH = "T14_NOTICE_PRAISE_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NOT_ID = "NOT_ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String TABLE = "T14_NOTICE_PRAISE";

	public static T14NoticePraiseDTO setDefaultValue() {
		T14NoticePraiseDTO defaultDTO = new T14NoticePraiseDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNotID(0l);

		defaultDTO.setPerID(0l);

		return defaultDTO;
	}
}
