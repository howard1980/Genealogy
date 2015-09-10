//
//  AddFamilyInfo.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "AddFamilyInfo.h"

@interface AddFamilyInfo()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *familyID; /**< 家族ID*/
@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 族人信息*/
@end
@implementation AddFamilyInfo

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsAddFamilyInfo";
        self.className = @"AddFamilyInfo";
    }
    return self;
}

- (void)postData:(NSString *)userID familyID:(NSString *)familyID userInfo:(UserInfoDTO *)userInfo{
    self.userID = userID;
    self.familyID = familyID;
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
    if (self.familyID) {
        dic[@"familyID"] = self.familyID;
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
    if (self.familyID.length<1) {
        [muArray addObject:@"家族ID不能为空!"];
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
