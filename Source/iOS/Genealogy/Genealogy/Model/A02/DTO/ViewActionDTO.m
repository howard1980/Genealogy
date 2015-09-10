//
//  ViewActionDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "ViewActionDTO.h"

@implementation ViewActionDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"actionID"] isKindOfClass:[NSNull class]]) {
        self.actionID = jsonData[@"actionID"];
    }
    if ([jsonData[@"userInfo"] isKindOfClass:[NSDictionary class]]) {
        self.userInfo = [[UserInfoDTO alloc] init];
        [self.userInfo loadDataWithJsonData:jsonData[@"userInfo"]];
    }
    if (![jsonData[@"actionDate"] isKindOfClass:[NSNull class]]) {
        self.actionDate = jsonData[@"actionDate"];
    }
    if ([jsonData[@"address"] isKindOfClass:[NSDictionary class]]) {
        self.address = [[AddressInfoDTO alloc] init];
        [self.address loadDataWithJsonData:jsonData[@"address"]];
    }
    if (![jsonData[@"praise"] isKindOfClass:[NSNull class]]) {
        self.praise = jsonData[@"praise"];
    }
    if (![jsonData[@"picture"] isKindOfClass:[NSNull class]]) {
        self.picture = jsonData[@"picture"];
    }
    if (![jsonData[@"introduction"] isKindOfClass:[NSNull class]]) {
        self.introduction = jsonData[@"introduction"];
    }
    if ([jsonData[@"pictures"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"pictures"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"pictures"]) {
                [tempArray addObject:data];
            }
            self.pictures = tempArray;
        }
    }
    if ([jsonData[@"videos"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"videos"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"videos"]) {
                [tempArray addObject:data];
            }
            self.videos = tempArray;
        }
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.actionID) {
        dic[@"actionID"] = self.actionID;
    }
    if (self.actionDate) {
        dic[@"actionDate"] = self.actionDate;
    }
    if (self.praise) {
        dic[@"praise"] = self.praise;
    }
    if (self.picture) {
        dic[@"picture"] = self.picture;
    }
    if (self.introduction) {
        dic[@"introduction"] = self.introduction;
    }
    if (self.pictures.count>0) {
        dic[@"pictures"] = self.pictures;
    }
    if (self.videos.count>0) {
        dic[@"videos"] = self.videos;
    }
    NSDictionary *userInfoDic = [self.userInfo buildRequestData];
    if (userInfoDic) {
        dic[@"userInfo"] = userInfoDic;
    }
    NSDictionary *addressDic = [self.address buildRequestData];
    if (addressDic) {
        dic[@"address"] = addressDic;
    }
    return dic;
}

@end
