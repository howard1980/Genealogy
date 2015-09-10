//
//  AddAction.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "AddAction.h"

@interface AddAction()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)ActionDTO *action; /**< 事件*/
@end
@implementation AddAction

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsAddAction";
        self.className = @"AddAction";
    }
    return self;
}

- (void)postData:(NSString *)userID action:(ActionDTO *)action{
    self.userID = userID;
    self.action = action;
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
    NSDictionary *actionDic = [self.action buildRequestData];
    if (actionDic) {
        dic[@"action"] = actionDic;
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
    if (![self.action checkRequired]) {
        [muArray addObject:@"事件不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
