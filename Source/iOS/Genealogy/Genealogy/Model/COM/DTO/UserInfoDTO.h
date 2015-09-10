//
//  UserInfoDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "AddressInfoDTO.h"

@interface UserInfoDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSMutableString *familyCode; /**< 家族代码*/
@property(nonatomic,strong)NSMutableString *name; /**< 名称*/
@property(nonatomic,strong)NSNumber *sex; /**< 性别*/
@property(nonatomic,strong)NSMutableString *birthday; /**< 出生年月日*/
@property(nonatomic,strong)NSMutableString *mobile; /**< 手机*/
@property(nonatomic,strong)NSMutableString *maile; /**< 邮箱*/
@property(nonatomic,strong)NSMutableString *backPath; /**< 背景*/
@property(nonatomic,strong)NSMutableString *selfPath; /**< 头像*/
@property(nonatomic,strong)NSMutableArray *picture; /**< 图片*/
@property(nonatomic,strong)NSMutableArray *video; /**< 视频*/
@property(nonatomic,strong)NSMutableString *profile; /**< 简介*/
@property(nonatomic,strong)AddressInfoDTO *address; /**< 所在位置*/


@end
