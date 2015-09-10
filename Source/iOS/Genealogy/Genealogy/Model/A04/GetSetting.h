//
//  GetSetting.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "SettingInfoDTO.h"

@interface GetSetting : ServiceBaseModel

@property(nonatomic,strong)SettingInfoDTO *settingInfo; /**< 用户设定情况*/

- (void)postData:(NSString *)userID;

@end
