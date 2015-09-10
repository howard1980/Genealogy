//
//  SettingInfoDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "SettingInfoDTO.h"

@implementation SettingInfoDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"value1"] isKindOfClass:[NSNull class]]) {
        self.value1 = jsonData[@"value1"];
    }
    if (![jsonData[@"value2"] isKindOfClass:[NSNull class]]) {
        self.value2 = jsonData[@"value2"];
    }
    if (![jsonData[@"value3"] isKindOfClass:[NSNull class]]) {
        self.value3 = jsonData[@"value3"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.value1) {
        dic[@"value1"] = self.value1;
    }
    if (self.value2) {
        dic[@"value2"] = self.value2;
    }
    if (self.value3) {
        dic[@"value3"] = self.value3;
    }
    return dic;
}

@end
