//
//  UpdatePeopleLocal.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdatePeopleLocal.h"

@interface UpdatePeopleLocal()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSNumber *longitude; /**< 经度*/
@property(nonatomic,strong)NSNumber *latitude; /**< 纬度*/
@property(nonatomic,strong)NSString *title; /**< 地址名称*/
@end
@implementation UpdatePeopleLocal

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdatePeopleLocal";
        self.className = @"UpdatePeopleLocal";
    }
    return self;
}

- (void)postData:(NSString *)userID longitude:(NSNumber *)longitude latitude:(NSNumber *)latitude title:(NSString *)title{
    self.userID = userID;
    self.longitude = longitude;
    self.latitude = latitude;
    self.title = title;
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
    if (self.longitude) {
        dic[@"longitude"] = self.longitude;
    }
    if (self.latitude) {
        dic[@"latitude"] = self.latitude;
    }
    if (self.title) {
        dic[@"title"] = self.title;
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
    if (!self.longitude) {
        [muArray addObject:@"经度不能为空!"];
        rest = NO;
    }
    if (!self.latitude) {
        [muArray addObject:@"纬度不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
