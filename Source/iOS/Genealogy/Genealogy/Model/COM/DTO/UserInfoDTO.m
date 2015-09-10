//
//  UserInfoDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UserInfoDTO.h"

@implementation UserInfoDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"userID"] isKindOfClass:[NSNull class]]) {
        self.userID = jsonData[@"userID"];
    }
    if (![jsonData[@"familyCode"] isKindOfClass:[NSNull class]]) {
        self.familyCode = jsonData[@"familyCode"];
    }
    if (![jsonData[@"name"] isKindOfClass:[NSNull class]]) {
        self.name = jsonData[@"name"];
    }
    if (![jsonData[@"sex"] isKindOfClass:[NSNull class]]) {
        self.sex = jsonData[@"sex"];
    }
    if (![jsonData[@"birthday"] isKindOfClass:[NSNull class]]) {
        self.birthday = jsonData[@"birthday"];
    }
    if (![jsonData[@"mobile"] isKindOfClass:[NSNull class]]) {
        self.mobile = jsonData[@"mobile"];
    }
    if (![jsonData[@"maile"] isKindOfClass:[NSNull class]]) {
        self.maile = jsonData[@"maile"];
    }
    if (![jsonData[@"backPath"] isKindOfClass:[NSNull class]]) {
        self.backPath = jsonData[@"backPath"];
    }
    if (![jsonData[@"selfPath"] isKindOfClass:[NSNull class]]) {
        self.selfPath = jsonData[@"selfPath"];
    }
    if ([jsonData[@"picture"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"picture"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"picture"]) {
                [tempArray addObject:data];
            }
            self.picture = tempArray;
        }
    }
    if ([jsonData[@"video"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"video"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"video"]) {
                [tempArray addObject:data];
            }
            self.video = tempArray;
        }
    }
    if (![jsonData[@"profile"] isKindOfClass:[NSNull class]]) {
        self.profile = jsonData[@"profile"];
    }
    if ([jsonData[@"address"] isKindOfClass:[NSDictionary class]]) {
        self.address = [[AddressInfoDTO alloc] init];
        [self.address loadDataWithJsonData:jsonData[@"address"]];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.userID) {
        dic[@"userID"] = self.userID;
    }
    if (self.familyCode) {
        dic[@"familyCode"] = self.familyCode;
    }
    if (self.name) {
        dic[@"name"] = self.name;
    }
    if (self.sex) {
        dic[@"sex"] = self.sex;
    }
    if (self.birthday) {
        dic[@"birthday"] = self.birthday;
    }
    if (self.mobile) {
        dic[@"mobile"] = self.mobile;
    }
    if (self.maile) {
        dic[@"maile"] = self.maile;
    }
    if (self.backPath) {
        dic[@"backPath"] = self.backPath;
    }
    if (self.selfPath) {
        dic[@"selfPath"] = self.selfPath;
    }
    if (self.profile) {
        dic[@"profile"] = self.profile;
    }
    if (self.picture.count>0) {
        dic[@"picture"] = self.picture;
    }
    if (self.video.count>0) {
        dic[@"video"] = self.video;
    }
    NSDictionary *addressDic = [self.address buildRequestData];
    if (addressDic) {
        dic[@"address"] = addressDic;
    }
    return dic;
}

@end
