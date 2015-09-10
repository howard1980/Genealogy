//
//  SettingInfoDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface SettingInfoDTO : ServiceBaseModel

@property(nonatomic,strong)NSNumber *value1; /**< 家人看事件*/
@property(nonatomic,strong)NSNumber *value2; /**< 外人看事件*/
@property(nonatomic,strong)NSNumber *value3; /**< 声音*/


@end
