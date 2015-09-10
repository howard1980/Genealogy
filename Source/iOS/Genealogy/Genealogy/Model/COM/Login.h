//
//  Login.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"
#import "FamilyInfoDTO.h"

@interface Login : ServiceBaseModel

@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 用户信息*/
@property(nonatomic,strong)NSMutableArray *familyInfoArray; /**< 家族信息*/

- (void)postData:(NSString *)mobile validCode:(NSString *)validCode familyCode:(NSString *)familyCode imsi:(NSNumber *)imsi regisitrationID:(NSString *)regisitrationID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude cityCode:(NSString *)cityCode;

@end
