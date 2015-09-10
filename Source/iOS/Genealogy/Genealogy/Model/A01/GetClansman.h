//
//  GetClansman.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "CleansmanDTO.h"

@interface GetClansman : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *cleansmen; /**< 族人通讯列表*/

- (void)postData:(NSString *)userID;

@end
