//
//  NoticeInfoDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "NoticeInfoDTO.h"

@implementation NoticeInfoDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"noticeID"] isKindOfClass:[NSNull class]]) {
        self.noticeID = jsonData[@"noticeID"];
    }
    if (![jsonData[@"date"] isKindOfClass:[NSNull class]]) {
        self.date = jsonData[@"date"];
    }
    if (![jsonData[@"time"] isKindOfClass:[NSNull class]]) {
        self.time = jsonData[@"time"];
    }
    if (![jsonData[@"distance"] isKindOfClass:[NSNull class]]) {
        self.distance = jsonData[@"distance"];
    }
    if (![jsonData[@"content"] isKindOfClass:[NSNull class]]) {
        self.content = jsonData[@"content"];
    }
    if (![jsonData[@"userFace"] isKindOfClass:[NSNull class]]) {
        self.userFace = jsonData[@"userFace"];
    }
    if (![jsonData[@"userName"] isKindOfClass:[NSNull class]]) {
        self.userName = jsonData[@"userName"];
    }
    if (![jsonData[@"userPhone"] isKindOfClass:[NSNull class]]) {
        self.userPhone = jsonData[@"userPhone"];
    }
    if (![jsonData[@"state"] isKindOfClass:[NSNull class]]) {
        self.state = jsonData[@"state"];
    }
    if ([jsonData[@"attentionFace"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"attentionFace"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"attentionFace"]) {
                [tempArray addObject:data];
            }
            self.attentionFace = tempArray;
        }
    }
    if ([jsonData[@"noticeComments"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"noticeComments"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"noticeComments"]) {
                [tempArray addObject:[[NoticeCommentDTO alloc]initWithJsonData:data]];
            }
            self.noticeComments = tempArray;
        }
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.noticeID) {
        dic[@"noticeID"] = self.noticeID;
    }
    if (self.date) {
        dic[@"date"] = self.date;
    }
    if (self.time) {
        dic[@"time"] = self.time;
    }
    if (self.distance) {
        dic[@"distance"] = self.distance;
    }
    if (self.content) {
        dic[@"content"] = self.content;
    }
    if (self.userFace) {
        dic[@"userFace"] = self.userFace;
    }
    if (self.userName) {
        dic[@"userName"] = self.userName;
    }
    if (self.userPhone) {
        dic[@"userPhone"] = self.userPhone;
    }
    if (self.state) {
        dic[@"state"] = self.state;
    }
    if (self.attentionFace.count>0) {
        dic[@"attentionFace"] = self.attentionFace;
    }
    NSMutableArray *arraynoticeComments =[NSMutableArray array];
    for (BaseModel *mode in self.noticeComments) {
        [arraynoticeComments addObject:[mode buildRequestData]];
    }
    if (arraynoticeComments.count>0) {
        dic[@"noticeComments"] = arraynoticeComments;
    }
    return dic;
}

@end
