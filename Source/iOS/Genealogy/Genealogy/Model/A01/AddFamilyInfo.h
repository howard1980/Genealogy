﻿//
//  AddFamilyInfo.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"

@interface AddFamilyInfo : ServiceBaseModel


- (void)postData:(NSString *)userID familyID:(NSString *)familyID userInfo:(UserInfoDTO *)userInfo;

@end
