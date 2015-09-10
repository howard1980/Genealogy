//
//  NoticeCommentDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "NoticeCommentDTO.h"

@implementation NoticeCommentDTO

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if (![jsonData[@"userFace"] isKindOfClass:[NSNull class]]) {
        self.userFace = jsonData[@"userFace"];
    }
    if (![jsonData[@"userName"] isKindOfClass:[NSNull class]]) {
        self.userName = jsonData[@"userName"];
    }
    if (![jsonData[@"date"] isKindOfClass:[NSNull class]]) {
        self.date = jsonData[@"date"];
    }
    if (![jsonData[@"time"] isKindOfClass:[NSNull class]]) {
        self.time = jsonData[@"time"];
    }
    if (![jsonData[@"comment"] isKindOfClass:[NSNull class]]) {
        self.comment = jsonData[@"comment"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.userFace) {
        dic[@"userFace"] = self.userFace;
    }
    if (self.userName) {
        dic[@"userName"] = self.userName;
    }
    if (self.date) {
        dic[@"date"] = self.date;
    }
    if (self.time) {
        dic[@"time"] = self.time;
    }
    if (self.comment) {
        dic[@"comment"] = self.comment;
    }
    return dic;
}

@end
