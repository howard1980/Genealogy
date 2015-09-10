//
//  UpdateSetting.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "SettingInfoDTO.h"

@interface UpdateSetting : ServiceBaseModel


- (void)postData:(NSString *)userID settingInfo:(SettingInfoDTO *)settingInfo;

@end
