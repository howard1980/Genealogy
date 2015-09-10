//
//  Regist.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface Regist : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *userID; /**< 用户ID*/

- (void)postData:(NSString *)mobile validCode:(NSString *)validCode imsi:(NSNumber *)imsi regisitrationID:(NSString *)regisitrationID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude cityCode:(NSString *)cityCode;

@end
