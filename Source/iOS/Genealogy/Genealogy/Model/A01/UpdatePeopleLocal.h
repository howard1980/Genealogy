//
//  UpdatePeopleLocal.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface UpdatePeopleLocal : ServiceBaseModel


- (void)postData:(NSString *)userID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude title:(NSString *)title;

@end
