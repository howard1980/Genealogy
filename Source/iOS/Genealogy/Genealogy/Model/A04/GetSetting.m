//
//  GetSetting.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetSetting.h"

@interface GetSetting()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@end
@implementation GetSetting

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetSetting";
        self.className = @"GetSetting";
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
    if ([jsonData[@"settingInfo"] isKindOfClass:[NSDictionary class]]) {
        self.settingInfo = [[SettingInfoDTO alloc] init];
        [self.settingInfo loadDataWithJsonData:jsonData[@"settingInfo"]];
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
