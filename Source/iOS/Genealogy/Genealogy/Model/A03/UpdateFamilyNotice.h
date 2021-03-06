﻿//
//  UpdateFamilyNotice.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "AddressInfoDTO.h"

@interface UpdateFamilyNotice : ServiceBaseModel


- (void)postData:(NSString *)userID noticeID:(NSString *)noticeID content:(NSString *)content date:(NSString *)date time:(NSString *)time address:(AddressInfoDTO *)address clansmanID:(NSArray *)clansmanID;

@end
