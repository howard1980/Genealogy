//
//  GetPeople.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetPeople.h"

@interface GetPeople()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@end
@implementation GetPeople

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetPeople";
        self.className = @"GetPeople";
    }
    return self;
}

- (void)postData:(NSString *)userID{
    self.userID = userID;
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
    if ([jsonData[@"userInfo"] isKindOfClass:[NSDictionary class]]) {
        self.userInfo = [[UserInfoDTO alloc] init];
        [self.userInfo loadDataWithJsonData:jsonData[@"userInfo"]];
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
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
