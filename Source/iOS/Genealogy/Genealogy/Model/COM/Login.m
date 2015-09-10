//
//  Login.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "Login.h"

@interface Login()
@property(nonatomic,strong)NSString *mobile; /**< 手机号*/
@property(nonatomic,strong)NSString *validCode; /**< 验证码*/
@property(nonatomic,strong)NSString *familyCode; /**< 家族代码*/
@property(nonatomic,strong)NSNumber *imsi; /**< 操作系统类型*/
@property(nonatomic,strong)NSString *regisitrationID; /**< 极光推送ID*/
@property(nonatomic,strong)NSNumber *longitude; /**< 经度*/
@property(nonatomic,strong)NSNumber *latitude; /**< 维度*/
@property(nonatomic,strong)NSString *cityCode; /**< 城市CD*/
@end
@implementation Login

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsLogin";
        self.className = @"Login";
    }
    return self;
}

- (void)postData:(NSString *)mobile validCode:(NSString *)validCode familyCode:(NSString *)familyCode imsi:(NSNumber *)imsi regisitrationID:(NSString *)regisitrationID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude cityCode:(NSString *)cityCode{
    self.mobile = mobile;
    self.validCode = validCode;
    self.familyCode = familyCode;
    self.imsi = imsi;
    self.regisitrationID = regisitrationID;
    self.longitude = longitude;
    self.latitude = latitude;
    self.cityCode = cityCode;
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
    if (self.mobile) {
        dic[@"mobile"] = self.mobile;
    }
    if (self.validCode) {
        dic[@"validCode"] = self.validCode;
    }
    if (self.familyCode) {
        dic[@"familyCode"] = self.familyCode;
    }
    if (self.imsi) {
        dic[@"imsi"] = self.imsi;
    }
    if (self.regisitrationID) {
        dic[@"regisitrationID"] = self.regisitrationID;
    }
    if (self.longitude) {
        dic[@"longitude"] = self.longitude;
    }
    if (self.latitude) {
        dic[@"latitude"] = self.latitude;
    }
    if (self.cityCode) {
        dic[@"cityCode"] = self.cityCode;
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
    if ([jsonData[@"familyInfoArray"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"familyInfoArray"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"familyInfoArray"]) {
                [tempArray addObject:[[FamilyInfoDTO alloc]initWithJsonData:data]];
            }
            self.familyInfoArray = tempArray;
        }
    }
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (self.mobile.length<1) {
        [muArray addObject:@"手机号不能为空!"];
        rest = NO;
    }
    if (!self.imsi) {
        [muArray addObject:@"操作系统类型不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
