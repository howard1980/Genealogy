//
//  UpdatePraise.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface UpdatePraise : ServiceBaseModel


- (void)postData:(NSString *)userID actionID:(NSString *)actionID state:(NSNumber *)state;

@end
