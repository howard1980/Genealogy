//
//  ValidCode.m
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "GetValidCode.h"

@interface GetValidCode()
@property (strong, nonatomic) NSString* mobile;
@end

@implementation GetValidCode

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetValidCode";
        self.className = @"GetValidCode";
    }
    return self;
}

- (void)postData:(NSString *)mobile{
    self.mobile = mobile;
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
    if (self.mobile) {
        dic[@"mobile"] = self.mobile;
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
}
@end
