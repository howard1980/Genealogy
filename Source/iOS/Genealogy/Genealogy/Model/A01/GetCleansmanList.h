//
//  GetCleansmanList.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "CleansmanDTO.h"

@interface GetCleansmanList : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *familyList; /**< 家族树结构*/

- (void)postData:(NSString *)userID familyID:(NSString *)familyID;

@end
