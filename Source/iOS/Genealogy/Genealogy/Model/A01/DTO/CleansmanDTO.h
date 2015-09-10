//
//  CleansmanDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"

@interface CleansmanDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *userIs; /**< 用户信息*/
@property(nonatomic,strong)NSMutableString *title; /**< 名称分组*/


@end
