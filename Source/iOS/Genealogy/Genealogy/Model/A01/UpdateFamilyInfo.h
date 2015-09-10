//
//  UpdateFamilyInfo.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "FamilyInfoDTO.h"

@interface UpdateFamilyInfo : ServiceBaseModel


- (void)postData:(NSString *)userID familyInfo:(FamilyInfoDTO *)familyInfo;

@end
