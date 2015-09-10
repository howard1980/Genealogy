//
//  GetAppVersion.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetAppVersion.h"

@interface GetAppVersion()
@property(nonatomic,strong)NSNumber *version; /**< 版本信息*/
@property(nonatomic,strong)NSNumber *channel; /**< 渠道号*/
@property(nonatomic,strong)NSNumber *type; /**< 类型*/
@end
@implementation GetAppVersion

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetAppVersion";
        self.className = @"GetAppVersion";
    }
    return self;
}

- (void)postData:(NSNumber *)version channel:(NSNumber *)channel type:(NSNumber *)type{
    self.version = version;
    self.channel = channel;
    self.type = type;
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
    if (self.version) {
        dic[@"version"] = self.version;
    }
    if (self.channel) {
        dic[@"channel"] = self.channel;
    }
    if (self.type) {
        dic[@"type"] = self.type;
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
    if (![jsonData[@"update"] isKindOfClass:[NSNull class]]) {
        self.update = jsonData[@"update"];
    }
    if (![jsonData[@"descrip"] isKindOfClass:[NSNull class]]) {
        self.descrip = jsonData[@"descrip"];
    }
    if (![jsonData[@"downloadUrl"] isKindOfClass:[NSNull class]]) {
        self.downloadUrl = jsonData[@"downloadUrl"];
    }
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (!self.version) {
        [muArray addObject:@"版本信息不能为空!"];
        rest = NO;
    }
    if (!self.channel) {
        [muArray addObject:@"渠道号不能为空!"];
        rest = NO;
    }
    if (!self.type) {
        [muArray addObject:@"类型不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
