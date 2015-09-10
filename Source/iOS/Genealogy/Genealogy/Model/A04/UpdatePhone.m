//
//  UpdatePhone.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UpdatePhone.h"

@interface UpdatePhone()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *mobile; /**< 手机号*/
@property(nonatomic,strong)NSString *validCode; /**< 验证码*/
@end
@implementation UpdatePhone

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUpdatePhone";
        self.className = @"UpdatePhone";
    }
    return self;
}

- (void)postData:(NSString *)userID mobile:(NSString *)mobile validCode:(NSString *)validCode{
    self.userID = userID;
    self.mobile = mobile;
    self.validCode = validCode;
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
    if (self.mobile) {
        dic[@"mobile"] = self.mobile;
    }
    if (self.validCode) {
        dic[@"validCode"] = self.validCode;
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
    if (self.mobile.length<1) {
        [muArray addObject:@"手机号不能为空!"];
        rest = NO;
    }
    if (self.validCode.length<1) {
        [muArray addObject:@"验证码不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
