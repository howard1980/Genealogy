//
//  AddressInfoDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface AddressInfoDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *title; /**< 地址名称*/
@property(nonatomic,strong)NSNumber *longitude; /**< 经度*/
@property(nonatomic,strong)NSNumber *latitude; /**< 纬度*/


@end
