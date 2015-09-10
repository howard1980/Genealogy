//
//  CleansmanDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "CleansmanDTO.h"

@implementation CleansmanDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if ([jsonData[@"userIs"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"userIs"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"userIs"]) {
                [tempArray addObject:[[UserInfoDTO alloc]initWithJsonData:data]];
            }
            self.userIs = tempArray;
        }
    }
    if (![jsonData[@"title"] isKindOfClass:[NSNull class]]) {
        self.title = jsonData[@"title"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.title) {
        dic[@"title"] = self.title;
    }
    NSMutableArray *arrayuserIs =[NSMutableArray array];
    for (BaseModel *mode in self.userIs) {
        [arrayuserIs addObject:[mode buildRequestData]];
    }
    if (arrayuserIs.count>0) {
        dic[@"userIs"] = arrayuserIs;
    }
    return dic;
}

@end
