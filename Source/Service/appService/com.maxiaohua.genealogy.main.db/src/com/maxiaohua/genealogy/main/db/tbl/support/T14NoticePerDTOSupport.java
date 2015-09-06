/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T14NoticePerDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
public abstract class T14NoticePerDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T14_NOTICE_PER_INSERT";

	public static final String FULL_UPDATE = "T14_NOTICE_PER_FULL_UPDATE";

	public static final String UPDATE = "T14_NOTICE_PER_UPDATE";

	public static final String DELETE = "T14_NOTICE_PER_DELETE";

	public static final String FIND = "T14_NOTICE_PER_FIND";

	public static final String FIND_FOR_UPDATE = "T14_NOTICE_PER_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T14_NOTICE_PER_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T14_NOTICE_PER_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T14_NOTICE_PER_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T14_NOTICE_PER_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T14_NOTICE_PER_SQL_SEARCH";

	public static final String COUNT = "T14_NOTICE_PER_COUNT";

	public static final String COUNT_OR = "T14_NOTICE_PER_COUNT_OR";

	public static final String COUNT_SEARCH = "T14_NOTICE_PER_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NOT_ID = "NOT_ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String TABLE = "T14_NOTICE_PER";

	public static T14NoticePerDTO setDefaultValue() {
		T14NoticePerDTO defaultDTO = new T14NoticePerDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNOTID(0l);

		defaultDTO.setPERID(0l);

		return defaultDTO;
	}
}
