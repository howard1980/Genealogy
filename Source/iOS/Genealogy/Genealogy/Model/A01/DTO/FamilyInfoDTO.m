//
//  FamilyInfoDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "FamilyInfoDTO.h"

@implementation FamilyInfoDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"familyID"] isKindOfClass:[NSNull class]]) {
        self.familyID = jsonData[@"familyID"];
    }
    if (![jsonData[@"arms"] isKindOfClass:[NSNull class]]) {
        self.arms = jsonData[@"arms"];
    }
    if (![jsonData[@"famileyName"] isKindOfClass:[NSNull class]]) {
        self.famileyName = jsonData[@"famileyName"];
    }
    if (![jsonData[@"introductionText"] isKindOfClass:[NSNull class]]) {
        self.introductionText = jsonData[@"introductionText"];
    }
    if (![jsonData[@"introductionPicture"] isKindOfClass:[NSNull class]]) {
        self.introductionPicture = jsonData[@"introductionPicture"];
    }
    if (![jsonData[@"introductionVideo"] isKindOfClass:[NSNull class]]) {
        self.introductionVideo = jsonData[@"introductionVideo"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.familyID) {
        dic[@"familyID"] = self.familyID;
    }
    if (self.arms) {
        dic[@"arms"] = self.arms;
    }
    if (self.famileyName) {
        dic[@"famileyName"] = self.famileyName;
    }
    if (self.introductionText) {
        dic[@"introductionText"] = self.introductionText;
    }
    if (self.introductionPicture) {
        dic[@"introductionPicture"] = self.introductionPicture;
    }
    if (self.introductionVideo) {
        dic[@"introductionVideo"] = self.introductionVideo;
    }
    return dic;
}

@end
