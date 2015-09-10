//
//  ActionDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "ActionDTO.h"

@implementation ActionDTO

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
    if (![jsonData[@"descriptions"] isKindOfClass:[NSNull class]]) {
        self.descriptions = jsonData[@"descriptions"];
    }
    if (![jsonData[@"type"] isKindOfClass:[NSNull class]]) {
        self.type = jsonData[@"type"];
    }
    if (![jsonData[@"date"] isKindOfClass:[NSNull class]]) {
        self.date = jsonData[@"date"];
    }
    if ([jsonData[@"location"] isKindOfClass:[NSDictionary class]]) {
        self.location = [[AddressInfoDTO alloc] init];
        [self.location loadDataWithJsonData:jsonData[@"location"]];
    }
    if (![jsonData[@"coverImage"] isKindOfClass:[NSNull class]]) {
        self.coverImage = jsonData[@"coverImage"];
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
    if (![jsonData[@"introduction"] isKindOfClass:[NSNull class]]) {
        self.introduction = jsonData[@"introduction"];
    }
    if (![jsonData[@"isPublic"] isKindOfClass:[NSNull class]]) {
        self.isPublic = jsonData[@"isPublic"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.actionID) {
        dic[@"actionID"] = self.actionID;
    }
    if (self.descriptions) {
        dic[@"descriptions"] = self.descriptions;
    }
    if (self.type) {
        dic[@"type"] = self.type;
    }
    if (self.date) {
        dic[@"date"] = self.date;
    }
    if (self.coverImage) {
        dic[@"coverImage"] = self.coverImage;
    }
    if (self.introduction) {
        dic[@"introduction"] = self.introduction;
    }
    if (self.isPublic) {
        dic[@"isPublic"] = self.isPublic;
    }
    if (self.pictures.count>0) {
        dic[@"pictures"] = self.pictures;
    }
    if (self.videos.count>0) {
        dic[@"videos"] = self.videos;
    }
    NSDictionary *locationDic = [self.location buildRequestData];
    if (locationDic) {
        dic[@"location"] = locationDic;
    }
    return dic;
}

@end
