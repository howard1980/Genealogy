//
//  DeleteFamilyInfo.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface DeleteFamilyInfo : ServiceBaseModel


- (void)postData:(NSString *)userID familyID:(NSString *)familyID;

@end
