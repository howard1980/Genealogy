//
//  NoticeDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface NoticeDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *noticeID; /**< 通知ID*/
@property(nonatomic,strong)NSMutableString *date; /**< 活动日期*/
@property(nonatomic,strong)NSMutableString *time; /**< 活动时间*/
@property(nonatomic,strong)NSMutableString *distance; /**< 距离*/
@property(nonatomic,strong)NSMutableString *content; /**< 内容*/
@property(nonatomic,strong)NSMutableString *userFace; /**< 用户头像*/
@property(nonatomic,strong)NSMutableString *userName; /**< 用户名*/
@property(nonatomic,strong)NSMutableString *userPhone; /**< 用户电话*/
@property(nonatomic,strong)NSNumber *state; /**< 关注状态*/


@end
