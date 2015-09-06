/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.constant;

/**
 * 区分コード（画面用）の関連定数を管理するクラス
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2014/04/23         GD                  新規作成
 *
 */
public interface CtgCodeForSceneConstant {

	/**
	* SEIBETU_KBN 性別
	*/
	public static enum SEIBETU_KBN {
		/**
		* M:男
		*/
		MALE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "M";
			}
		},
		/**
		* F:女
		*/
		FEMALE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "F";
			}
		},
		/**
		* O:他
		*/
		OTHER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "O";
			}
		},
		/**
		* U:不明
		*/
		UNKNOW {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "U";
			}
		},
		/**
		* R:
		*/
		REST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "R";
			}
		}
	}

	/**
	* SEIBETU_KBN_NAME 性別
	*/
	public static enum SEIBETU_KBN_NAME {
		/**
		* M:男
		*/
		MALE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "男";
			}
		},
		/**
		* F:女
		*/
		FEMALE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "女";
			}
		},
		/**
		* O:他
		*/
		OTHER_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "他";
			}
		},
		/**
		* U:不明
		*/
		UNKNOW_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "不明";
			}
		},
		/**
		* R:
		*/
		REST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "";
			}
		}
	}

	/**
	* VISIT_COUNT 初再診区分
	*/
	public static enum VISIT_COUNT {
		/**
		*  :再診
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:再診
		*/
		SAISHIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:初診
		*/
		SYOSHIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:科初診
		*/
		KASYUSHIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:病院初診
		*/
		BYOUIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* ?:不明
		*/
		UNKNOWN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "?";
			}
		}
	}

	/**
	* VISIT_COUNT_NAME 初再診区分
	*/
	public static enum VISIT_COUNT_NAME {
		/**
		*  :再診
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "再診";
			}
		},
		/**
		* 0:再診
		*/
		SAISHIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "再診";
			}
		},
		/**
		* 1:初診
		*/
		SYOSHIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "初診";
			}
		},
		/**
		* 2:科初診
		*/
		KASYUSHIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "科初診";
			}
		},
		/**
		* 3:病院初診
		*/
		BYOUIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "病院初診";
			}
		},
		/**
		* ?:不明
		*/
		UNKNOWN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "不明";
			}
		}
	}

	/**
	* YK_TIME 予約時刻
	*/
	public static enum YK_TIME {
		/**
		* START:00:00:01
		*/
		START {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "START";
			}
		},
		/**
		* END:12:59:59
		*/
		END {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "END";
			}
		}
	}

	/**
	* YK_TIME_NAME 予約時刻
	*/
	public static enum YK_TIME_NAME {
		/**
		* START:00:00:01
		*/
		START_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "00:00:01";
			}
		},
		/**
		* END:12:59:59
		*/
		END_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "12:59:59";
			}
		}
	}

	/**
	* NYUGAI_KBN 入外区分
	*/
	public static enum NYUGAI_KBN {
		/**
		* 1:外来
		*/
		GAIRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:入院
		*/
		NYUIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* O:
		*/
		OTHER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "O";
			}
		}
	}

	/**
	* NYUGAI_KBN_NAME 入外区分
	*/
	public static enum NYUGAI_KBN_NAME {
		/**
		* 1:外来
		*/
		GAIRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "外来";
			}
		},
		/**
		* 2:入院
		*/
		NYUIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "入院";
			}
		},
		/**
		* O:
		*/
		OTHER_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "";
			}
		}
	}

	/**
	* NYUIN_KBN 入院中区分
	*/
	public static enum NYUIN_KBN {
		/**
		* 1:入院中
		*/
		NYUIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* NYUIN_KBN_NAME 入院中区分
	*/
	public static enum NYUIN_KBN_NAME {
		/**
		* 1:入院中
		*/
		NYUIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "入院中";
			}
		}
	}

	/**
	* SYOUKAI_KBN 紹介状有り
	*/
	public static enum SYOUKAI_KBN {
		/**
		* 1:紹介状有り通常
		*/
		TUJYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:紹介状有り緊急
		*/
		KINKYU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* SYOUKAI_KBN_NAME 紹介状有り
	*/
	public static enum SYOUKAI_KBN_NAME {
		/**
		* 1:紹介状有り通常
		*/
		TUJYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "紹介状有り通常";
			}
		},
		/**
		* 3:紹介状有り緊急
		*/
		KINKYU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "紹介状有り緊急";
			}
		}
	}

	/**
	* EXAM_UKETUKE 検体検査受付
	*/
	public static enum EXAM_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:受付済(一部）
		*/
		UKETUKE_PARTIAL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済(全部)
		*/
		UKETUKE_ALL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "7";
			}
		},
		/**
		* ?:(未定義のステータス)
		*/
		UNKNOWN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "?";
			}
		}
	}

	/**
	* EXAM_UKETUKE_NAME 検体検査受付
	*/
	public static enum EXAM_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "ラベル発行済";
			}
		},
		/**
		* 3:受付済(一部）
		*/
		UKETUKE_PARTIAL_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済(一部）";
			}
		},
		/**
		* 4:受付済(全部)
		*/
		UKETUKE_ALL_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済(全部)";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査中止";
			}
		},
		/**
		* ?:(未定義のステータス)
		*/
		UNKNOWN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "(未定義のステータス)";
			}
		}
	}

	/**
	* GERM_UKETUKE 細菌検査受付
	*/
	public static enum GERM_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:受付済(一部）
		*/
		UKETUKE_PARTIAL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済(全部）
		*/
		UKETUKE_ALL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "7";
			}
		}
	}

	/**
	* GERM_UKETUKE_NAME 細菌検査受付
	*/
	public static enum GERM_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "ラベル発行済";
			}
		},
		/**
		* 3:受付済(一部）
		*/
		UKETUKE_PARTIAL_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済(一部）";
			}
		},
		/**
		* 4:受付済(全部）
		*/
		UKETUKE_ALL_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済(全部）";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査中止";
			}
		}
	}

	/**
	* PATHOL_UKETUKE 病理検査受付
	*/
	public static enum PATHOL_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:最終報告済
		*/
		FINAL_REPORT_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* PATHOL_UKETUKE_NAME 病理検査受付
	*/
	public static enum PATHOL_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 2:ラベル発行済
		*/
		LABEL_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "ラベル発行済";
			}
		},
		/**
		* 3:最終報告済
		*/
		FINAL_REPORT_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "最終報告済";
			}
		}
	}

	/**
	* PHYSIO_UKETUKE 生理検査受付
	*/
	public static enum PHYSIO_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "7";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* PHYSIO_UKETUKE_NAME 生理検査受付
	*/
	public static enum PHYSIO_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "実施済";
			}
		},
		/**
		* 7:検査中止
		*/
		KENSA_STOP_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査中止";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* SCOPE_UKETUKE 内視鏡検査受付
	*/
	public static enum SCOPE_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* SCOPE_UKETUKE_NAME 内視鏡検査受付
	*/
	public static enum SCOPE_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "実施済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* RAD_UKETUKE 放射線検査受付
	*/
	public static enum RAD_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* RAD_UKETUKE_NAME 放射線検査受付
	*/
	public static enum RAD_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "実施済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* RI_UKETUKE RI検査受付
	*/
	public static enum RI_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* RI_UKETUKE_NAME RI検査受付
	*/
	public static enum RI_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 4:受付済
		*/
		UKETUKE_FOUR_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 5:実施済
		*/
		JISSHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "実施済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* SHOT_UKETUKE 注射受付
	*/
	public static enum SHOT_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* SHOT_UKETUKE_NAME 注射受付
	*/
	public static enum SHOT_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* REHABILI_UKETUKE リハビリ受付
	*/
	public static enum REHABILI_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* REHABILI_UKETUKE_NAME リハビリ受付
	*/
	public static enum REHABILI_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* TREAT_UKETUKE 処置受付
	*/
	public static enum TREAT_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* TREAT_UKETUKE_NAME 処置受付
	*/
	public static enum TREAT_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* OPE_UKETUKE 手術受付
	*/
	public static enum OPE_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:申込保留
		*/
		HORYU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:決定済
		*/
		KETTEI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 5:手術済
		*/
		SHUJUTSU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* OPE_UKETUKE_NAME 手術受付
	*/
	public static enum OPE_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:申込保留
		*/
		HORYU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "申込保留";
			}
		},
		/**
		* 2:決定済
		*/
		KETTEI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "決定済";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 5:手術済
		*/
		SHUJUTSU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "手術済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* BLOOD_UKETUKE 輸血受付
	*/
	public static enum BLOOD_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* BLOOD_UKETUKE_NAME 輸血受付
	*/
	public static enum BLOOD_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* RT_UKETUKE 放射線治療受付
	*/
	public static enum RT_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* RT_UKETUKE_NAME 放射線治療受付
	*/
	public static enum RT_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* DIET_UKETUKE 栄養指導受付
	*/
	public static enum DIET_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* DIET_UKETUKE_NAME 栄養指導受付
	*/
	public static enum DIET_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* SHINRYO_UKETUKE 診療受付区分
	*/
	public static enum SHINRYO_UKETUKE {
		/**
		*  :未来院
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:未来院
		*/
		MIRAIIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:病院到着
		*/
		BYOUIN_TOUCYAKU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:中待ち
		*/
		NAKA_MACHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:診察中
		*/
		SHINSATUCYU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:保留
		*/
		HORYU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		}
	}

	/**
	* SHINRYO_UKETUKE_NAME 診療受付区分
	*/
	public static enum SHINRYO_UKETUKE_NAME {
		/**
		*  :未来院
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未来院";
			}
		},
		/**
		* 0:未来院
		*/
		MIRAIIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未来院";
			}
		},
		/**
		* 1:病院到着
		*/
		BYOUIN_TOUCYAKU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "病院到着";
			}
		},
		/**
		* 2:中待ち
		*/
		NAKA_MACHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "中待ち";
			}
		},
		/**
		* 3:診察中
		*/
		SHINSATUCYU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "診察中";
			}
		},
		/**
		* 4:保留
		*/
		HORYU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "保留";
			}
		},
		/**
		* 5:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* CHEMO_UKETUKE 化学療法受付区分
	*/
	public static enum CHEMO_UKETUKE {
		/**
		*  :依頼中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* CHEMO_UKETUKE_NAME 化学療法受付区分
	*/
	public static enum CHEMO_UKETUKE_NAME {
		/**
		*  :依頼中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 3:受付済
		*/
		UKETUKE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受付済";
			}
		},
		/**
		* 9:終了
		*/
		SYURYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "終了";
			}
		}
	}

	/**
	* YK_OD_KIND 予約種別名称
	*/
	public static enum YK_OD_KIND {
		/**
		* 11:検体検査
		*/
		YK_OD_KIND_11 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "11";
			}
		},
		/**
		* 12:細菌検査
		*/
		YK_OD_KIND_12 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "12";
			}
		},
		/**
		* 13:病理検査
		*/
		YK_OD_KIND_13 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "13";
			}
		},
		/**
		* 14:生理検査
		*/
		YK_OD_KIND_14 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "14";
			}
		},
		/**
		* 15:内視鏡検査
		*/
		YK_OD_KIND_15 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "15";
			}
		},
		/**
		* 16:放射線検査
		*/
		YK_OD_KIND_16 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "16";
			}
		},
		/**
		* 17:RI検査
		*/
		YK_OD_KIND_17 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "17";
			}
		},
		/**
		* 22:注射
		*/
		YK_OD_KIND_22 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "22";
			}
		},
		/**
		* 23:リハビリ
		*/
		YK_OD_KIND_23 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "23";
			}
		},
		/**
		* 24:処置
		*/
		YK_OD_KIND_24 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "24";
			}
		},
		/**
		* 25:手術
		*/
		YK_OD_KIND_25 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "25";
			}
		},
		/**
		* 26:輸血
		*/
		YK_OD_KIND_26 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "26";
			}
		},
		/**
		* 27:放射線治療
		*/
		YK_OD_KIND_27 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "27";
			}
		},
		/**
		* 32:栄養指導
		*/
		YK_OD_KIND_32 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "32";
			}
		},
		/**
		* 51:診療予約
		*/
		YK_OD_KIND_51 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "51";
			}
		},
		/**
		* 71:化学療法予約
		*/
		YK_OD_KIND_71 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "71";
			}
		},
		/**
		* XX:（未対応の予約種別）
		*/
		YK_OD_KIND_XX {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "XX";
			}
		}
	}

	/**
	* YK_OD_KIND_NAME 予約種別名称
	*/
	public static enum YK_OD_KIND_NAME {
		/**
		* 11:検体検査
		*/
		YK_OD_KIND_11_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検体検査";
			}
		},
		/**
		* 12:細菌検査
		*/
		YK_OD_KIND_12_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "細菌検査";
			}
		},
		/**
		* 13:病理検査
		*/
		YK_OD_KIND_13_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "病理検査";
			}
		},
		/**
		* 14:生理検査
		*/
		YK_OD_KIND_14_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "生理検査";
			}
		},
		/**
		* 15:内視鏡検査
		*/
		YK_OD_KIND_15_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "内視鏡検査";
			}
		},
		/**
		* 16:放射線検査
		*/
		YK_OD_KIND_16_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "放射線検査";
			}
		},
		/**
		* 17:RI検査
		*/
		YK_OD_KIND_17_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "RI検査";
			}
		},
		/**
		* 22:注射
		*/
		YK_OD_KIND_22_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "注射";
			}
		},
		/**
		* 23:リハビリ
		*/
		YK_OD_KIND_23_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "リハビリ";
			}
		},
		/**
		* 24:処置
		*/
		YK_OD_KIND_24_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "処置";
			}
		},
		/**
		* 25:手術
		*/
		YK_OD_KIND_25_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "手術";
			}
		},
		/**
		* 26:輸血
		*/
		YK_OD_KIND_26_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "輸血";
			}
		},
		/**
		* 27:放射線治療
		*/
		YK_OD_KIND_27_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "放射線治療";
			}
		},
		/**
		* 32:栄養指導
		*/
		YK_OD_KIND_32_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "栄養指導";
			}
		},
		/**
		* 51:診療予約
		*/
		YK_OD_KIND_51_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "診療予約";
			}
		},
		/**
		* 71:化学療法予約
		*/
		YK_OD_KIND_71_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "化学療法予約";
			}
		},
		/**
		* XX:（未対応の予約種別）
		*/
		YK_OD_KIND_XX_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "（未対応の予約種別）";
			}
		}
	}

	/**
	* YK_KJ_ST5 検査結果報告区分
	*/
	public static enum YK_KJ_ST5 {
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 9:報告済
		*/
		REPORT_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* YK_KJ_ST5_NAME 検査結果報告区分
	*/
	public static enum YK_KJ_ST5_NAME {
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:依頼中
		*/
		IRAI_ONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 9:報告済
		*/
		REPORT_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "報告済";
			}
		}
	}

	/**
	* HOKEN_MARK 保険公費区分
	*/
	public static enum HOKEN_MARK {
		/**
		* 1:【公１】
		*/
		KOHI1 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:【公２】
		*/
		KOHI2 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:【公３】
		*/
		KOHI3 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:【公４】
		*/
		KOHI4 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		}
	}

	/**
	* HOKEN_MARK_NAME 保険公費区分
	*/
	public static enum HOKEN_MARK_NAME {
		/**
		* 1:【公１】
		*/
		KOHI1_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "【公１】";
			}
		},
		/**
		* 2:【公２】
		*/
		KOHI2_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "【公２】";
			}
		},
		/**
		* 3:【公３】
		*/
		KOHI3_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "【公３】";
			}
		},
		/**
		* 4:【公４】
		*/
		KOHI4_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "【公４】";
			}
		}
	}

	/**
	* KEIZOKU_KBN 保険継続区分
	*/
	public static enum KEIZOKU_KBN {
		/**
		* 1:(継続)
		*/
		KEIZOUKU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* KEIZOKU_KBN_NAME 保険継続区分
	*/
	public static enum KEIZOKU_KBN_NAME {
		/**
		* 1:(継続)
		*/
		KEIZOUKU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "(継続)";
			}
		}
	}

	/**
	* MAIN_KBN 保険主区分
	*/
	public static enum MAIN_KBN {
		/**
		* 1:【主】
		*/
		MAIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MAIN_KBN_NAME 保険主区分
	*/
	public static enum MAIN_KBN_NAME {
		/**
		* 1:【主】
		*/
		MAIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "【主】";
			}
		}
	}

	/**
	* SIJI_FLG 指示状況区分
	*/
	public static enum SIJI_FLG {
		/**
		* 0:未指示受けあり
		*/
		UKE_MI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:全て指示受け済み
		*/
		UKE_ZIMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:疑義照会あり
		*/
		UKE_GIGI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* SIJI_FLG_NAME 指示状況区分
	*/
	public static enum SIJI_FLG_NAME {
		/**
		* 0:未指示受けあり
		*/
		UKE_MI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未指示受けあり";
			}
		},
		/**
		* 1:全て指示受け済み
		*/
		UKE_ZIMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "全て指示受け済み";
			}
		},
		/**
		* 2:疑義照会あり
		*/
		UKE_GIGI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "疑義照会あり";
			}
		}
	}

	/**
	* TIME_KBN 時間区分文字
	*/
	public static enum TIME_KBN {
		/**
		* 0:翌日
		*/
		TOMORROW {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:朝
		*/
		MORNING {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:昼
		*/
		NOON {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:夕
		*/
		AFTERNOON {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* TIME_KBN_NAME 時間区分文字
	*/
	public static enum TIME_KBN_NAME {
		/**
		* 0:翌日
		*/
		TOMORROW_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "翌日";
			}
		},
		/**
		* 1:朝
		*/
		MORNING_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "朝";
			}
		},
		/**
		* 2:昼
		*/
		NOON_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "昼";
			}
		},
		/**
		* 3:夕
		*/
		AFTERNOON_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "夕";
			}
		}
	}

	/**
	* DAIKO_KBN 代行入力区分
	*/
	public static enum DAIKO_KBN {
		/**
		* 1:未承認
		*/
		MISYOSHIN {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:承認済
		*/
		SYOSHIN_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* DAIKO_KBN_NAME 代行入力区分
	*/
	public static enum DAIKO_KBN_NAME {
		/**
		* 1:未承認
		*/
		MISYOSHIN_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未承認";
			}
		},
		/**
		* 2:承認済
		*/
		SYOSHIN_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "承認済";
			}
		}
	}

	/**
	* MASUI_SYBT1 麻酔種別1
	*/
	public static enum MASUI_SYBT1 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:全麻
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT1_NAME 麻酔種別1
	*/
	public static enum MASUI_SYBT1_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:全麻
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "全麻";
			}
		}
	}

	/**
	* MASUI_SYBT2 麻酔種別2
	*/
	public static enum MASUI_SYBT2 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:局麻
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT2_NAME 麻酔種別2
	*/
	public static enum MASUI_SYBT2_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:局麻
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "局麻";
			}
		}
	}

	/**
	* MASUI_SYBT3 麻酔種別3
	*/
	public static enum MASUI_SYBT3 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:硬麻
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT3_NAME 麻酔種別3
	*/
	public static enum MASUI_SYBT3_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:硬麻
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "硬麻";
			}
		}
	}

	/**
	* MASUI_SYBT4 麻酔種別4
	*/
	public static enum MASUI_SYBT4 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:腰麻
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT4_NAME 麻酔種別4
	*/
	public static enum MASUI_SYBT4_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:腰麻
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "腰麻";
			}
		}
	}

	/**
	* MASUI_SYBT5 麻酔種別5
	*/
	public static enum MASUI_SYBT5 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:伝麻
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT5_NAME 麻酔種別5
	*/
	public static enum MASUI_SYBT5_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:伝麻
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "伝麻";
			}
		}
	}

	/**
	* MASUI_SYBT6 麻酔種別6
	*/
	public static enum MASUI_SYBT6 {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:静脈
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* MASUI_SYBT6_NAME 麻酔種別6
	*/
	public static enum MASUI_SYBT6_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:静脈
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "静脈";
			}
		}
	}

	/**
	* YUKETU_ORD_FLG 輸血申込ﾌﾗｸﾞ
	*/
	public static enum YUKETU_ORD_FLG {
		/**
		* 0:なし
		*/
		NONE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:あり
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* YUKETU_ORD_FLG_NAME 輸血申込ﾌﾗｸﾞ
	*/
	public static enum YUKETU_ORD_FLG_NAME {
		/**
		* 0:なし
		*/
		NONE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "なし";
			}
		},
		/**
		* 1:あり
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "あり";
			}
		}
	}

	/**
	* BLOOD_PROF_KBN 輸血単位
	*/
	public static enum BLOOD_PROF_KBN {
		/**
		* 0:??
		*/
		OTHER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:cc
		*/
		CC {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:ml
		*/
		ML {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:単位
		*/
		UNIT {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:個
		*/
		INDIVIDUAL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 4:本
		*/
		BOOK {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		}
	}

	/**
	* BLOOD_PROF_KBN_NAME 輸血単位
	*/
	public static enum BLOOD_PROF_KBN_NAME {
		/**
		* 0:??
		*/
		OTHER_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "??";
			}
		},
		/**
		* 1:cc
		*/
		CC_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "cc";
			}
		},
		/**
		* 2:ml
		*/
		ML_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "ml";
			}
		},
		/**
		* 3:単位
		*/
		UNIT_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "単位";
			}
		},
		/**
		* 4:個
		*/
		INDIVIDUAL_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "個";
			}
		},
		/**
		* 4:本
		*/
		BOOK_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "本";
			}
		}
	}

	/**
	* SH_KBN 職種区分
	*/
	public static enum SH_KBN {
		/**
		* 1:医師
		*/
		DOC {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:看護師
		*/
		NUS {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:技師
		*/
		TECH {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:クラーク(事務員)
		*/
		CLERK {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:その他
		*/
		OTHER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		}
	}

	/**
	* SH_KBN_NAME 職種区分
	*/
	public static enum SH_KBN_NAME {
		/**
		* 1:医師
		*/
		DOC_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "医師";
			}
		},
		/**
		* 2:看護師
		*/
		NUS_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "看護師";
			}
		},
		/**
		* 3:技師
		*/
		TECH_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "技師";
			}
		},
		/**
		* 4:クラーク(事務員)
		*/
		CLERK_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "クラーク(事務員)";
			}
		},
		/**
		* 5:その他
		*/
		OTHER_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "その他";
			}
		}
	}

	/**
	* SMRY_STATUS サマリー・ステータス
	*/
	public static enum SMRY_STATUS {
		/**
		*  :未作成
		*/
		SMRY_STATUS_SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 0:中断
		*/
		SMRY_STATUS_0 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:作成済
		*/
		SMRY_STATUS_1 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:承認済み
		*/
		SMRY_STATUS_2 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:表示対象外
		*/
		SMRY_STATUS_3 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* ?:不明
		*/
		SMRY_STATUS_NON {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "?";
			}
		}
	}

	/**
	* SMRY_STATUS_NAME サマリー・ステータス
	*/
	public static enum SMRY_STATUS_NAME {
		/**
		*  :未作成
		*/
		SMRY_STATUS_SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未作成";
			}
		},
		/**
		* 0:中断
		*/
		SMRY_STATUS_0_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "中断";
			}
		},
		/**
		* 1:作成済
		*/
		SMRY_STATUS_1_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "作成済";
			}
		},
		/**
		* 2:承認済み
		*/
		SMRY_STATUS_2_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "承認済み";
			}
		},
		/**
		* 3:表示対象外
		*/
		SMRY_STATUS_3_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "表示対象外";
			}
		},
		/**
		* ?:不明
		*/
		SMRY_STATUS_NON_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "不明";
			}
		}
	}

	/**
	* CHG_REASON_CD 変更理由コード
	*/
	public static enum CHG_REASON_CD {
		/**
		* 02:退院
		*/
		CHG_REASON_OUT {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "02";
			}
		},
		/**
		* 04,05,06,54,B:転科
		*/
		CHG_REASON_MOD {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "04,05,06,54,B";
			}
		},
		/**
		* ?:その他
		*/
		CHG_REASON_OTH {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "?";
			}
		}
	}

	/**
	* CHG_REASON_CD_NAME 変更理由コード
	*/
	public static enum CHG_REASON_CD_NAME {
		/**
		* 02:退院
		*/
		CHG_REASON_OUT_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "退院";
			}
		},
		/**
		* 04,05,06,54,B:転科
		*/
		CHG_REASON_MOD_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "転科";
			}
		},
		/**
		* ?:その他
		*/
		CHG_REASON_OTH_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "その他";
			}
		}
	}

	/**
	* CONS_KBN 診察区分
	*/
	public static enum CONS_KBN {
		/**
		* 1:外来診療
		*/
		GAIRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:病棟往診
		*/
		BYOTOM {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* CONS_KBN_NAME 診察区分
	*/
	public static enum CONS_KBN_NAME {
		/**
		* 1:外来診療
		*/
		GAIRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "外来診療";
			}
		},
		/**
		* 2:病棟往診
		*/
		BYOTOM_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "病棟往診";
			}
		}
	}

	/**
	* TAKA_YOYAKU_KBN 他科予約区分
	*/
	public static enum TAKA_YOYAKU_KBN {
		/**
		* 1:他科予約
		*/
		EXIST {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}

	/**
	* TAKA_YOYAKU_KBN_NAME 他科予約区分
	*/
	public static enum TAKA_YOYAKU_KBN_NAME {
		/**
		* 1:他科予約
		*/
		EXIST_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "他科予約";
			}
		}
	}

	/**
	* STOP_STATUS 中断ステータス
	*/
	public static enum STOP_STATUS {
		/**
		* 0:中断中
		*/
		STOP {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:確定登録済み
		*/
		FIX {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:レコードの廃棄
		*/
		DISCARD {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* STOP_STATUS_NAME 中断ステータス
	*/
	public static enum STOP_STATUS_NAME {
		/**
		* 0:中断中
		*/
		STOP_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "中断中";
			}
		},
		/**
		* 1:確定登録済み
		*/
		FIX_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "確定登録済み";
			}
		},
		/**
		* 2:レコードの廃棄
		*/
		DISCARD_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "レコードの廃棄";
			}
		}
	}

	/**
	* STOP_RSN_KBN 中断理由
	*/
	public static enum STOP_RSN_KBN {
		/**
		* 1:ユーザーによる仮登録
		*/
		STOP_RSN_KBN_1 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:自動ログオフによる中断
		*/
		STOP_RSN_KBN_2 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:夜間自動終了による中断
		*/
		STOP_RSN_KBN_3 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* STOP_RSN_KBN_NAME 中断理由
	*/
	public static enum STOP_RSN_KBN_NAME {
		/**
		* 1:ユーザーによる仮登録
		*/
		STOP_RSN_KBN_1_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "ユーザーによる仮登録";
			}
		},
		/**
		* 2:自動ログオフによる中断
		*/
		STOP_RSN_KBN_2_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "自動ログオフによる中断";
			}
		},
		/**
		* 3:夜間自動終了による中断
		*/
		STOP_RSN_KBN_3_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "夜間自動終了による中断";
			}
		}
	}

	/**
	* BUMON_FLG2_D82 出力ステータス
	*/
	public static enum BUMON_FLG2_D82 {
		/**
		*  :未送信
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 1:帳票済
		*/
		TYOUHYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:FAX済
		*/
		FAX {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:帳票FAX済
		*/
		TYOUHYOU_FAX {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* BUMON_FLG2_D82_NAME 出力ステータス
	*/
	public static enum BUMON_FLG2_D82_NAME {
		/**
		*  :未送信
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未送信";
			}
		},
		/**
		* 1:帳票済
		*/
		TYOUHYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "帳票済";
			}
		},
		/**
		* 2:FAX済
		*/
		FAX_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "FAX済";
			}
		},
		/**
		* 3:帳票FAX済
		*/
		TYOUHYOU_FAX_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "帳票FAX済";
			}
		}
	}

	/**
	* REFERRAL_STATUS 紹介患者ステータス
	*/
	public static enum REFERRAL_STATUS {
		/**
		*  :紹介中
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 1:報告済
		*/
		REPORT_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:最終報告済
		*/
		FINAL_REPORT_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:報告不要
		*/
		REPORT_HUYOU {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* REFERRAL_STATUS_NAME 紹介患者ステータス
	*/
	public static enum REFERRAL_STATUS_NAME {
		/**
		*  :紹介中
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "紹介中";
			}
		},
		/**
		* 1:報告済
		*/
		REPORT_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "報告済";
			}
		},
		/**
		* 2:最終報告済
		*/
		FINAL_REPORT_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "最終報告済";
			}
		},
		/**
		* 3:報告不要
		*/
		REPORT_HUYOU_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "報告不要";
			}
		}
	}

	/**
	* TO_REFERRAL_STATUS 他院へ紹介ステータス
	*/
	public static enum TO_REFERRAL_STATUS {
		/**
		*  :仮登録
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 1:作成済
		*/
		CREAT {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:受領済
		*/
		RECEIVE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:発送済
		*/
		SEND {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		}
	}

	/**
	* TO_REFERRAL_STATUS_NAME 他院へ紹介ステータス
	*/
	public static enum TO_REFERRAL_STATUS_NAME {
		/**
		*  :仮登録
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "仮登録";
			}
		},
		/**
		* 1:作成済
		*/
		CREAT_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "作成済";
			}
		},
		/**
		* 2:受領済
		*/
		RECEIVE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "受領済";
			}
		},
		/**
		* 3:発送済
		*/
		SEND_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "発送済";
			}
		}
	}

	/**
	* RECORD_FLG スキャナオーダーテーブル
	*/
	public static enum RECORD_FLG {
		/**
		* 0:依頼中
		*/
		IRAI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:登録済み
		*/
		TOUROKU_ZUMI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 9:中止
		*/
		TYUUSHI {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "9";
			}
		}
	}

	/**
	* RECORD_FLG_NAME スキャナオーダーテーブル
	*/
	public static enum RECORD_FLG_NAME {
		/**
		* 0:依頼中
		*/
		IRAI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "依頼中";
			}
		},
		/**
		* 1:登録済み
		*/
		TOUROKU_ZUMI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "登録済み";
			}
		},
		/**
		* 9:中止
		*/
		TYUUSHI_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "中止";
			}
		}
	}

	/**
	* APPROVAL_KBN 承認区分
	*/
	public static enum APPROVAL_KBN {
		/**
		* 0:未承認
		*/
		UNAPPROVED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:承認済み
		*/
		APPROVED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:修正依頼
		*/
		NEED_UPDATE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* APPROVAL_KBN_NAME 承認区分
	*/
	public static enum APPROVAL_KBN_NAME {
		/**
		* 0:未承認
		*/
		UNAPPROVED_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "未承認";
			}
		},
		/**
		* 1:承認済み
		*/
		APPROVED_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "承認済み";
			}
		},
		/**
		* 2:修正依頼
		*/
		NEED_UPDATE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "修正依頼";
			}
		}
	}

	/**
	* IRAI_KBN 依頼区分
	*/
	public static enum IRAI_KBN {
		/**
		*  :
		*/
		SPACE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return " ";
			}
		},
		/**
		* 1:確認
		*/
		FIX {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:最終更新
		*/
		UPDATE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		}
	}

	/**
	* IRAI_KBN_NAME 依頼区分
	*/
	public static enum IRAI_KBN_NAME {
		/**
		*  :
		*/
		SPACE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "";
			}
		},
		/**
		* 1:確認
		*/
		FIX_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "確認";
			}
		},
		/**
		* 2:最終更新
		*/
		UPDATE_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "最終更新";
			}
		}
	}

	/**
	* YK_PREKEN_FLG 診察前検査フラグ
	*/
	public static enum YK_PREKEN_FLG {
		/**
		* 0:
		*/
		YK_PREKEN_FLG_0 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:検査未
		*/
		YK_PREKEN_FLG_1 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:検査中
		*/
		YK_PREKEN_FLG_2 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:検査済
		*/
		YK_PREKEN_FLG_3 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:至急済
		*/
		YK_PREKEN_FLG_4 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		}
	}

	/**
	* YK_PREKEN_FLG_NAME 診察前検査フラグ
	*/
	public static enum YK_PREKEN_FLG_NAME {
		/**
		* 0:
		*/
		YK_PREKEN_FLG_0_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "";
			}
		},
		/**
		* 1:検査未
		*/
		YK_PREKEN_FLG_1_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査未";
			}
		},
		/**
		* 2:検査中
		*/
		YK_PREKEN_FLG_2_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査中";
			}
		},
		/**
		* 3:検査済
		*/
		YK_PREKEN_FLG_3_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "検査済";
			}
		},
		/**
		* 4:至急済
		*/
		YK_PREKEN_FLG_4_NAME {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "至急済";
			}
		}
	}

}
