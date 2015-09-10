//
//  AddressInfoDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "AddressInfoDTO.h"

@implementation AddressInfoDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"title"] isKindOfClass:[NSNull class]]) {
        self.title = jsonData[@"title"];
    }
    if (![jsonData[@"longitude"] isKindOfClass:[NSNull class]]) {
        self.longitude = jsonData[@"longitude"];
    }
    if (![jsonData[@"latitude"] isKindOfClass:[NSNull class]]) {
        self.latitude = jsonData[@"latitude"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.title) {
        dic[@"title"] = self.title;
    }
    if (self.longitude) {
        dic[@"longitude"] = self.longitude;
    }
    if (self.latitude) {
        dic[@"latitude"] = self.latitude;
    }
    return dic;
}

@end
