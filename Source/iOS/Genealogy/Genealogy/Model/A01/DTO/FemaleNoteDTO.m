//
//  FemaleNoteDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "FemaleNoteDTO.h"

@implementation FemaleNoteDTO

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
    if ([jsonData[@"familey"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"familey"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"familey"]) {
                [tempArray addObject:[[FamileyNoteDTO alloc]initWithJsonData:data]];
            }
            self.familey = tempArray;
        }
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    NSMutableArray *arrayfamiley =[NSMutableArray array];
    for (BaseModel *mode in self.familey) {
        [arrayfamiley addObject:[mode buildRequestData]];
    }
    if (arrayfamiley.count>0) {
        dic[@"familey"] = arrayfamiley;
    }
    NSDictionary *userInfoDic = [self.userInfo buildRequestData];
    if (userInfoDic) {
        dic[@"userInfo"] = userInfoDic;
    }
    return dic;
}

@end
