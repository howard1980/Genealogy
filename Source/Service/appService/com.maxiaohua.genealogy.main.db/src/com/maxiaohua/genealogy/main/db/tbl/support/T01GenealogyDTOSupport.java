/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T01GenealogyDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
public abstract class T01GenealogyDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T01_GENEALOGY_INSERT";

	public static final String FULL_UPDATE = "T01_GENEALOGY_FULL_UPDATE";

	public static final String UPDATE = "T01_GENEALOGY_UPDATE";

	public static final String DELETE = "T01_GENEALOGY_DELETE";

	public static final String FIND = "T01_GENEALOGY_FIND";

	public static final String FIND_FOR_UPDATE = "T01_GENEALOGY_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T01_GENEALOGY_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T01_GENEALOGY_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T01_GENEALOGY_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T01_GENEALOGY_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T01_GENEALOGY_SQL_SEARCH";

	public static final String COUNT = "T01_GENEALOGY_COUNT";

	public static final String COUNT_OR = "T01_GENEALOGY_COUNT_OR";

	public static final String COUNT_SEARCH = "T01_GENEALOGY_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_FIRST_NAME = "FIRST_NAME";

	public static final String COLUMN_ARMS = "ARMS";

	public static final String COLUMN_VIDEO = "VIDEO";

	public static final String COLUMN_INFOMATION = "INFOMATION";

	public static final String COLUMN_BIGINT = "BIGINT";

	public static final String TABLE = "T01_GENEALOGY";

	public static T01GenealogyDTO setDefaultValue() {
		T01GenealogyDTO defaultDTO = new T01GenealogyDTO();

		defaultDTO.setID(0l);

		defaultDTO.setFIRSTNAME(StringUtil.EMPTY);

		defaultDTO.setARMS(StringUtil.EMPTY);

		defaultDTO.setVIDEO(StringUtil.EMPTY);

		defaultDTO.setINFOMATION(StringUtil.EMPTY);

		defaultDTO.setBIGINT(0l);

		return defaultDTO;
	}
}
