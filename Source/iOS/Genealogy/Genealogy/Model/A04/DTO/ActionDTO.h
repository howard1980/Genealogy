//
//  ActionDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "AddressInfoDTO.h"

@interface ActionDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *actionID; /**< 事件ID*/
@property(nonatomic,strong)NSMutableString *descriptions; /**< 事件说明*/
@property(nonatomic,strong)NSNumber *type; /**< 事件类型*/
@property(nonatomic,strong)NSMutableString *date; /**< 事件时间*/
@property(nonatomic,strong)AddressInfoDTO *location; /**< 事件地点*/
@property(nonatomic,strong)NSMutableString *coverImage; /**< 封面图片*/
@property(nonatomic,strong)NSMutableArray *pictures; /**< 事件图片*/
@property(nonatomic,strong)NSMutableArray *videos; /**< 事件视频*/
@property(nonatomic,strong)NSMutableString *introduction; /**< 事件介绍*/
@property(nonatomic,strong)NSNumber *isPublic; /**< 是否公开*/


@end
