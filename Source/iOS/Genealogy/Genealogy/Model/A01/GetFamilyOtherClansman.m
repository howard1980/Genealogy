﻿//
//  GetFamilyOtherClansman.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetFamilyOtherClansman.h"

@interface GetFamilyOtherClansman()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *familyID; /**< 家族ID*/
@end
@implementation GetFamilyOtherClansman

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetFamilyOtherClansman";
        self.className = @"GetFamilyOtherClansman";
    }
    return self;
}

- (void)postData:(NSString *)userID familyID:(NSString *)familyID{
    self.userID = userID;
    self.familyID = familyID;
    [self requestWebService:^{
        if (delegate) {
            [delegate successMethd:self];
        }
    } faild:^{
        if (delegate) {
            [delegate errorMethd];
        }
    }];
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.userID) {
        dic[@"userID"] = self.userID;
    }
    if (self.familyID) {
        dic[@"familyID"] = self.familyID;
    }
    return dic;
}

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
    if ([jsonData[@"cleansmen"] isKindOfClass:[NSDictionary class]]) {
        self.cleansmen = [[CleansmanDTO alloc] init];
        [self.cleansmen loadDataWithJsonData:jsonData[@"cleansmen"]];
    }
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (self.userID.length<1) {
        [muArray addObject:@"用户ID不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
