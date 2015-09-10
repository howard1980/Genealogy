//
//  CommentDTO.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "CommentDTO.h"

@implementation CommentDTO

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
    if (![jsonData[@"comment"] isKindOfClass:[NSNull class]]) {
        self.comment = jsonData[@"comment"];
    }
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.comment) {
        dic[@"comment"] = self.comment;
    }
    NSDictionary *userInfoDic = [self.userInfo buildRequestData];
    if (userInfoDic) {
        dic[@"userInfo"] = userInfoDic;
    }
    return dic;
}

@end
