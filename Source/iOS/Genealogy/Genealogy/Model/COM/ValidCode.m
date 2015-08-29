//
//  ValidCode.m
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "ValidCode.h"

@interface ValidCode()
//ValidCodeOutDTO *dto;
@property (strong, nonatomic) NSString* phone;
@end

@implementation ValidCode

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"SsValidCode";
        className = @"ValidCode";
    }
    return self;
}

- (void)postData:(NSString *)phone{
    self.phone = phone;
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
    if (self.phone) {
        dic[@"phone"] = self.phone;
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
