//
//  UpdateSetting.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdateSetting.h"

@interface UpdateSetting()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)SettingInfoDTO *settingInfo; /**< 用户设定情况*/
@end
@implementation UpdateSetting

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdateSetting";
        self.className = @"UpdateSetting";
    }
    return self;
}

- (void)postData:(NSString *)userID settingInfo:(SettingInfoDTO *)settingInfo{
    self.userID = userID;
    self.settingInfo = settingInfo;
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
    NSDictionary *settingInfoDic = [self.settingInfo buildRequestData];
    if (settingInfoDic) {
        dic[@"settingInfo"] = settingInfoDic;
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
    if (![self.settingInfo checkRequired]) {
        [muArray addObject:@"用户设定情况不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
