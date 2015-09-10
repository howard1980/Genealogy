//
//  AttentionNotice.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "AttentionNotice.h"

@interface AttentionNotice()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *noticeID; /**< 通告ID*/
@property(nonatomic,strong)NSNumber *state; /**< 状态*/
@end
@implementation AttentionNotice

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsAttentionNotice";
        self.className = @"AttentionNotice";
    }
    return self;
}

- (void)postData:(NSString *)userID noticeID:(NSString *)noticeID state:(NSNumber *)state{
    self.userID = userID;
    self.noticeID = noticeID;
    self.state = state;
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
    if (self.state) {
        dic[@"state"] = self.state;
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
    if (!self.state) {
        [muArray addObject:@"状态不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
