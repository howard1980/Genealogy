//
//  ViewActionDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"
#import "AddressInfoDTO.h"

@interface ViewActionDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *actionID; /**< 事件ID*/
@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 发布人*/
@property(nonatomic,strong)NSMutableString *actionDate; /**< 事件时间*/
@property(nonatomic,strong)AddressInfoDTO *address; /**< 事件地点*/
@property(nonatomic,strong)NSNumber *praise; /**< 点赞数*/
@property(nonatomic,strong)NSMutableString *picture; /**< 事件首图*/
@property(nonatomic,strong)NSMutableString *introduction; /**< 事件介绍*/
@property(nonatomic,strong)NSMutableArray *pictures; /**< 事件图片*/
@property(nonatomic,strong)NSMutableArray *videos; /**< 事件视频*/


@end
