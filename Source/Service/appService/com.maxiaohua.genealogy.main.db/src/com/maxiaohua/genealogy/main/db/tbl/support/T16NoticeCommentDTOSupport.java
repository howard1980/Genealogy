/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T16NoticeCommentDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class T16NoticeCommentDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T16_NOTICE_COMMENT_INSERT";

	public static final String FULL_UPDATE = "T16_NOTICE_COMMENT_FULL_UPDATE";

	public static final String UPDATE = "T16_NOTICE_COMMENT_UPDATE";

	public static final String DELETE = "T16_NOTICE_COMMENT_DELETE";

	public static final String FIND = "T16_NOTICE_COMMENT_FIND";

	public static final String FIND_FOR_UPDATE = "T16_NOTICE_COMMENT_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T16_NOTICE_COMMENT_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T16_NOTICE_COMMENT_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T16_NOTICE_COMMENT_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T16_NOTICE_COMMENT_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T16_NOTICE_COMMENT_SQL_SEARCH";

	public static final String COUNT = "T16_NOTICE_COMMENT_COUNT";

	public static final String COUNT_OR = "T16_NOTICE_COMMENT_COUNT_OR";

	public static final String COUNT_SEARCH = "T16_NOTICE_COMMENT_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NOT_ID = "NOT_ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_COMMENT = "COMMENT";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String TABLE = "T16_NOTICE_COMMENT";

	public static T16NoticeCommentDTO setDefaultValue() {
		T16NoticeCommentDTO defaultDTO = new T16NoticeCommentDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNotID(0l);

		defaultDTO.setPerID(0l);

		defaultDTO.setComment(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
