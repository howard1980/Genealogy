//
//  CheckVersion.m
//  Genealogy
//
//  Created by xiao huama on 15/9/7.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "GetAppVersion.h"

@interface GetAppVersion ()

@property (strong, nonatomic) NSNumber* version;
@property (strong, nonatomic) NSNumber* channel;
@property (strong, nonatomic) NSNumber* type;

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

- (NSMutableDictionary *)buildRequestData{
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

- (void)loadDataWithJsonData:(id)jsonData{
    if ([jsonData isKindOfClass:[NSData class]]) {
        jsonData = [NSJSONSerialization JSONObjectWithData:jsonData options:kNilOptions error:nil];
    }
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

@end
