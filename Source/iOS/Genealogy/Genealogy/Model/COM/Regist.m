//
//  Regist.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "Regist.h"

@interface Regist()
@property(nonatomic,strong)NSString *mobile; /**< 手机号*/
@property(nonatomic,strong)NSString *validCode; /**< 验证码*/
@property(nonatomic,strong)NSNumber *imsi; /**< 操作系统类型*/
@property(nonatomic,strong)NSString *regisitrationID; /**< 极光推送ID*/
@property(nonatomic,strong)NSNumber *longitude; /**< 经度*/
@property(nonatomic,strong)NSNumber *latitude; /**< 维度*/
@property(nonatomic,strong)NSString *cityCode; /**< 城市CD*/
@end
@implementation Regist

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsRegist";
        self.className = @"Regist";
    }
    return self;
}

- (void)postData:(NSString *)mobile validCode:(NSString *)validCode imsi:(NSNumber *)imsi regisitrationID:(NSString *)regisitrationID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude cityCode:(NSString *)cityCode{
    self.mobile = mobile;
    self.validCode = validCode;
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
    if (![jsonData[@"userID"] isKindOfClass:[NSNull class]]) {
        self.userID = jsonData[@"userID"];
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
    if (self.validCode.length<1) {
        [muArray addObject:@"验证码不能为空!"];
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
