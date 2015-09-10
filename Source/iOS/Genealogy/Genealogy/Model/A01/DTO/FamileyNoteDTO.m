//
//  FamileyNoteDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "FamileyNoteDTO.h"

@implementation FamileyNoteDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if ([jsonData[@"userInfo"] isKindOfClass:[NSDictionary class]]) {
        self.userInfo = [[UserInfoDTO alloc] init];
        [self.userInfo loadDataWithJsonData:jsonData[@"userInfo"]];
    }
    if ([jsonData[@"wives"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"wives"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"wives"]) {
                [tempArray addObject:[[FemaleNoteDTO alloc]initWithJsonData:data]];
            }
            self.wives = tempArray;
        }
    }
    if (![jsonData[@"weight"] isKindOfClass:[NSNull class]]) {
        self.weight = jsonData[@"weight"];
    }
    if (![jsonData[@"plies"] isKindOfClass:[NSNull class]]) {
        self.plies = jsonData[@"plies"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.weight) {
        dic[@"weight"] = self.weight;
    }
    if (self.plies) {
        dic[@"plies"] = self.plies;
    }
    NSMutableArray *arraywives =[NSMutableArray array];
    for (BaseModel *mode in self.wives) {
        [arraywives addObject:[mode buildRequestData]];
    }
    if (arraywives.count>0) {
        dic[@"wives"] = arraywives;
    }
    NSDictionary *userInfoDic = [self.userInfo buildRequestData];
    if (userInfoDic) {
        dic[@"userInfo"] = userInfoDic;
    }
    return dic;
}

@end
