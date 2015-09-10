//
//  UpdateFamilyInfo.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdateFamilyInfo.h"

@interface UpdateFamilyInfo()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)FamilyInfoDTO *familyInfo; /**< 家族信息*/
@end
@implementation UpdateFamilyInfo

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdateFamilyInfo";
        self.className = @"UpdateFamilyInfo";
    }
    return self;
}

- (void)postData:(NSString *)userID familyInfo:(FamilyInfoDTO *)familyInfo{
    self.userID = userID;
    self.familyInfo = familyInfo;
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
    NSDictionary *familyInfoDic = [self.familyInfo buildRequestData];
    if (familyInfoDic) {
        dic[@"familyInfo"] = familyInfoDic;
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
    if (![self.familyInfo checkRequired]) {
        [muArray addObject:@"家族信息不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
