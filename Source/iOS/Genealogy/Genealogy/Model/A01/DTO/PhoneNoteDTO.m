//
//  PhoneNoteDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "PhoneNoteDTO.h"

@implementation PhoneNoteDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"name"] isKindOfClass:[NSNull class]]) {
        self.name = jsonData[@"name"];
    }
    if (![jsonData[@"phone"] isKindOfClass:[NSNull class]]) {
        self.phone = jsonData[@"phone"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.name) {
        dic[@"name"] = self.name;
    }
    if (self.phone) {
        dic[@"phone"] = self.phone;
    }
    return dic;
}

@end
