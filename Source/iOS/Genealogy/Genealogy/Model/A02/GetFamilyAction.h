//
//  GetFamilyAction.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "ViewActionDTO.h"

@interface GetFamilyAction : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *actions; /**< 活动列表*/

- (void)postData:(NSString *)userID familyID:(NSString *)familyID pageIndex:(NSNumber *)pageIndex;

@end
