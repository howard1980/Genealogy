﻿//
//  AttentionNotice.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface AttentionNotice : ServiceBaseModel


- (void)postData:(NSString *)userID noticeID:(NSString *)noticeID state:(NSNumber *)state;

@end
