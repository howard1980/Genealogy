//
//  GetFamilyNoticeInfo.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetFamilyNoticeInfo.h"

@interface GetFamilyNoticeInfo()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *noticeID; /**< 通告ID*/
@end
@implementation GetFamilyNoticeInfo

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetFamilyNoticeInfo";
        self.className = @"GetFamilyNoticeInfo";
    }
    return self;
}

- (void)postData:(NSString *)userID noticeID:(NSString *)noticeID{
    self.userID = userID;
    self.noticeID = noticeID;
    [self requestWebService:^{
        if (delegate) {
            [delegate successMethd:self];
        }
    } faild:^{
        if (delegate) {
            [delegate errorMethd];
        }
    }];
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.userID) {
        dic[@"userID"] = self.userID;
    }
    if (self.noticeID) {
        dic[@"noticeID"] = self.noticeID;
    }
    return dic;
}

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (self.userID.length<1) {
        [muArray addObject:@"用户ID不能为空!"];
        rest = NO;
    }
    if (self.noticeID.length<1) {
        [muArray addObject:@"通告ID不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
