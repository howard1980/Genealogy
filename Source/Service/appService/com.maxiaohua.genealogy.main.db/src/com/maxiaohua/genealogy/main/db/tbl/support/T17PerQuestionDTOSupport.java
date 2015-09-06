/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T17PerQuestionDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
public abstract class T17PerQuestionDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T17_PER_QUESTION_INSERT";

	public static final String FULL_UPDATE = "T17_PER_QUESTION_FULL_UPDATE";

	public static final String UPDATE = "T17_PER_QUESTION_UPDATE";

	public static final String DELETE = "T17_PER_QUESTION_DELETE";

	public static final String FIND = "T17_PER_QUESTION_FIND";

	public static final String FIND_FOR_UPDATE = "T17_PER_QUESTION_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T17_PER_QUESTION_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T17_PER_QUESTION_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T17_PER_QUESTION_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T17_PER_QUESTION_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T17_PER_QUESTION_SQL_SEARCH";

	public static final String COUNT = "T17_PER_QUESTION_COUNT";

	public static final String COUNT_OR = "T17_PER_QUESTION_COUNT_OR";

	public static final String COUNT_SEARCH = "T17_PER_QUESTION_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_QUESTION = "QUESTION";

	public static final String COLUMN_STATE = "STATE";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_UPDATE_DATE = "UPDATE_DATE";

	public static final String TABLE = "T17_PER_QUESTION";

	public static T17PerQuestionDTO setDefaultValue() {
		T17PerQuestionDTO defaultDTO = new T17PerQuestionDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPERID(0l);

		defaultDTO.setQUESTION(StringUtil.EMPTY);

		defaultDTO.setSTATE(StringUtil.EMPTY);

		defaultDTO.setCREATEDATE(new java.sql.Timestamp(System.currentTimeMillis()));

		defaultDTO.setUPDATEDATE(new java.sql.Timestamp(System.currentTimeMillis()));

		return defaultDTO;
	}
}
