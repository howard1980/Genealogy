/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.constant;

/**
 * 类别管理class
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2014/04/29         GD                  新規作成
 *
 */
public interface CtgCodeConstant {
	/**
	* SEX 性别
	*/
	public static enum SEX {
		/**
		* 0:其他
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
		* 1:女
		*/
		FEMALE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:男
		*/
		MALE {
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
	* SEX 性别
	*/
	public static enum STREAMTYPE {
		/**
		* 0:图片
		*/
		PICTURE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},
		/**
		* 1:视频
		*/
		VIDEO {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		}
	}
	
//	/**
//	* TACCLOG_ACC_STATUS アクセス・ステータス TACCLOG.ACC_STATUS
//	*/
//	public static enum TACCLOG_ACC_STATUS {
//		/**
//		* 0:アクセス終了
//		*/
//		ACC_STATUS_0 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:アクセス中
//		*/
//		ACC_STATUS_1 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		}
//	}
	
//	/**
//	* TCOMBLCM_MODE ユーザー認証の方法 TCOMBLCM.MODE
//	*/
//	public static enum TCOMBLCM_MODE {
//		/**
//		* 0:CIS
//		*/
//		AUTHENTICATION_TYPE_CIS {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:LDAP
//		*/
//		AUTHENTICATION_TYPE_LDAP {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		}
//	}
	
//	/**
//	* TLOGINLG_RESULT ログインアウト成否 TLOGINLG.RESULT
//	*/
//	public static enum TLOGINLG_RESULT {
//		/**
//		* 0:認証成功
//		*/
//		LOGIN_SUCCESS {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:認証失敗
//		*/
//		LOGIN_FAIL {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:初期パスワード未変更
//		*/
//		NOT_UPDATE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		},
//		/**
//		* 3:パスワード有効期限切れ
//		*/
//		EXPIRED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "3";
//			}
//		},
//		/**
//		* 8:ログアウト成功
//		*/
//		LOGOUT_SUCCESS {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "8";
//			}
//		},
//		/**
//		* 9:ログアウト失敗
//		*/
//		LOGOUT_FAIL {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "9";
//			}
//		}
//	}
	
	/**
	* APP_SOFTWARE_TYPE 终端类型
	*/
	public static enum APP_SOFTWARE_TYPE {
		/**
		* 6:TopID
		*/
		OWNER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "6";
			}
		},
		/**
		* 1:Android客户端
		*/
		ANDROID_CLIENT {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:IOS客户端
		*/
		IOS_CLIENT {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:Android工作端
		*/
		ANDROID_WOKER {
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
	* AREA_OPEN_TYPE 区域开通类型
	*/
	public static enum AREA_OPEN_TYPE {
		/**
		* 7:TopID
		*/
		OWNER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "7";
			}
		},
		/**
		* 0:未开通
		*/
		NOT_OPENED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},		
		/**
		* 1:开通中
		*/
		OPENING {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:关闭
		*/
		CLOSEED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:Android工作端
		*/
		ANDROID_WOKER {
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
	* ORDER_STATUS 订单状态
	*/
	public static enum ORDER_STATUS {
		/**
		* 8:TopID
		*/
		OWNER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "8";
			}
		},
		/**
		* 0:已取消
		*/
		CANCEL {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},		
		/**
		* 1:待支付
		*/
		CREATEED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
		/**
		* 2:已付款
		*/
		PAID {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		},
		/**
		* 3:处理中
		*/
		PROCESSING {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "3";
			}
		},
		/**
		* 4:已完成
		*/
		COMPLETED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "4";
			}
		},
		/**
		* 5:已评论
		*/
		COMMENTED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "5";
			}
		}
	}
	
//	/**
//	* WASH_FLG 清洗区分
//	*/
//	public static enum WASH_FLG {
//		/**
//		* 9:TopID
//		*/
//		OWNER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "9";
//			}
//		},
//		/**
//		* 0:随行洗车
//		*/
//		SXXC {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},		
//		/**
//		* 1:到店洗车
//		*/
//		SHOP {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//	}
	
	/**
	* DELETE_FLG 删除区分
	*/
	public static enum DELETE_FLG {
		/**
		* 10:TopID
		*/
		OWNER {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "10";
			}
		},
		/**
		* 0:未删除
		*/
		NO_DELETED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},		
		/**
		* 1:删除
		*/
		DELETED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
	}
	
//	/**
//	* ACCOUNT_TYPE 账户区分
//	*/
//	public static enum ACCOUNT_TYPE {
//		/**
//		* 11:TopID
//		*/
//		OWNER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "11";
//			}
//		},
//		/**
//		* 0:车管家
//		*/
//		SXXC {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		}
//	}
	
//	/**
//	* RECHARGE_TYPE 充值区分
//	*/
//	public static enum RECHARGE_TYPE {
//		/**
//		* 12:TopID
//		*/
//		OWNER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "12";
//			}
//		},
//		/**
//		* 0:消费
//		*/
//		CONSUMPTION {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:充值
//		*/
//		RECHARGE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		}
//	}
	
	/**
	* LOGIN_STATUS 登陆状态
	*/
	public static enum LOGIN_STATUS {
		
		/**
		* 1:在线
		*/		
		ONLINE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
			
		},
		/**
		* 0:离线
		*/
		OFFLINE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		}
		 
	}
	
//	/**
//	* WORKER_PLAN_UPDATE_FLAG 更新 WorkerPlan 
//	*/
//	public static enum WORKER_PLAN_FLAG {
//		
//		/**
//		* 0:删除
//		*/		
//		DELETE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		/**
//		* 1:新增
//		*/
//		INSERT {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:修改
//		*/
//		UPDATE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		}		 
//	}
//	
//	/**
//	* WORKER_PLAN_UPDATE_FLAG 更新 WorkerPlan 
//	*/
//	public static enum WORKER_PLAN_STATUS {
//		
//		/**
//		* 0:未通过
//		*/		
//		REJECTED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		REQUEST
//		/**
//		* 1:已提出
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:已审批
//		*/
//		APPROVED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		}		 
//	}
//	
//	/**
//	* 洗车证明图片，0标识洗车前的图片 1标识洗车后的图片
//	*/
//	public static enum ORDER_EVIDENCE_STATUS {
//		
//		/**
//		* 0:洗车前
//		*/		
//		BEFORE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		AFTER
//		/**
//		* 1:洗车后
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		} 	 
//	}
//	
//	/**
//	* 用户类型 0:用户端 1:服务端
//	*/
//	public static enum PUSH_USER_TYPE {
//		
//		/**
//		* 0:用户端
//		*/		
//		CLIENT {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		SERVICE
//		/**
//		* 1:服务端
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		} 	 
//	}
//	
//	/**
//	* 代金券状态
//	*/
//	public static enum CASH_COUPON_TYPE {
//		
//		/**
//		* 0: 刚创建，未生效 关闭 不可用
//		*/		
//		closed {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		EFFECT
//		/**
//		* 1:已生效
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		} 	 ,
//		OVERTIME
//		/**
//		* 2:已过期
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		} 
//	}
//	
//	/**
//	* 代金券使用记录
//	*/
//	public static enum CASH_COUPON_RECORD_TYPE {
//		
//		/**
//		* 0: 已使用成功，已消耗，不可再用
//		*/		
//		USED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		RETURNED 
//		/**
//		* 1:使用失败返还用户，未消耗，可再次使用，如退单
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		} 	 ,
//		IN_USE
//		/**
//		* 2:使用中，如 订单已创建中 待付款
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		} 	 ,
//		CAN_USE
//		/**
//		* 3:可使用
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "3";
//			}
//		}
//	}
	/**
	* 识别码：
	* 0：Android
	* 1：Ios
	* 2：Windows Phone
	* 3：其他
	*/
	public static enum IMSI_TYPE {
		
		/**
		* 0:  
		*/		
		ANDROID {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
			
		},
		IOS
		/**
		* 1 
		*/
		 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		} 	 ,
		WP
		/**
		* 2: 
		*/
		 {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "2";
			}
		} 
	}
	
//	/**
//	* 代金券支付区分：
//	* 0：非付款购买
//	* 1：付款购买
//	*/
//	public static enum CASHCOUPON_FLG {
//		
//		/**
//		* 0:  非付款购买
//		*/		
//		NO_PAY {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		/**
//		* 1:  付款购买
//		*/
//		PAIED
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		}
//	}
//	
//	/**
//	* 订单类型：
//	* 101：随行洗车订单
//	* 102：洗车代金卷
//	*/
//	public static enum ORDER_TYPE {
//		
//		/**
//		* 101:  洗车订单
//		*/		
//		SXXC_ORDER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "101";
//			}
//			
//		},
//		/**
//		* 102:  洗车代金卷
//		*/
//		SXXC_CASH_COUPON
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "102";
//			}
//		}
//	}
	
	/*
	public static final Integer CATAGORY_P_MESSAGE_STATE =2;
	public static final Integer CATAGORY_P_USER_STATE =3;
	public static final Integer CATAGORY_P_ORDER_STATE =4;
	public static final Integer CATAGORY_P_COURSE_STATE =5;
	public static final Integer CATAGORY_P_EVALUATION_STATE =6;
	public static final Integer CATAGORY_P_HOMEWORK_STATE =7;
	public static final Integer CATAGORY_P_COURESE_TYPE =8;
	public static final Integer CATAGORY_P_PAYMENT_TYPE =9;
	public static final Integer CATAGORY_P_COURESES =10;
	*/
}
