//
//  GetFamilyOtherClansman.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "CleansmanDTO.h"

@interface GetFamilyOtherClansman : ServiceBaseModel

@property(nonatomic,strong)CleansmanDTO *cleansmen; /**< 族人通讯列表*/

- (void)postData:(NSString *)userID familyID:(NSString *)familyID;

@end
