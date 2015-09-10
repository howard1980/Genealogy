//
//  GetPeople.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"

@interface GetPeople : ServiceBaseModel

@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 族人信息*/

- (void)postData:(NSString *)userID;

@end
