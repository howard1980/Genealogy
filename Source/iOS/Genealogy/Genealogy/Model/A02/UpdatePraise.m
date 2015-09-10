//
//  UpdatePraise.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdatePraise.h"

@interface UpdatePraise()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *actionID; /**< 活动ID*/
@property(nonatomic,strong)NSNumber *state; /**< 状态*/
@end
@implementation UpdatePraise

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdatePraise";
        self.className = @"UpdatePraise";
    }
    return self;
}

- (void)postData:(NSString *)userID actionID:(NSString *)actionID state:(NSNumber *)state{
    self.userID = userID;
    self.actionID = actionID;
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
    if (self.actionID) {
        dic[@"actionID"] = self.actionID;
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
    if (self.actionID.length<1) {
        [muArray addObject:@"活动ID不能为空!"];
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
