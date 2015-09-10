//
//  GetFamilyNotice.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "NoticeDTO.h"

@interface GetFamilyNotice : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *noticeArray; /**< 通告列表*/

- (void)postData:(NSString *)userID state:(NSNumber *)state pages:(NSNumber *)pages;

@end
