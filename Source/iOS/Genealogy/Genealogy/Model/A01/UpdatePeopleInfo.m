//
//  UpdatePeopleInfo.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdatePeopleInfo.h"

@interface UpdatePeopleInfo()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 族人信息*/
@end
@implementation UpdatePeopleInfo

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdatePeopleInfo";
        self.className = @"UpdatePeopleInfo";
    }
    return self;
}

- (void)postData:(NSString *)userID userInfo:(UserInfoDTO *)userInfo{
    self.userID = userID;
    self.userInfo = userInfo;
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
    NSDictionary *userInfoDic = [self.userInfo buildRequestData];
    if (userInfoDic) {
        dic[@"userInfo"] = userInfoDic;
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
    if (![self.userInfo checkRequired]) {
        [muArray addObject:@"族人信息不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
