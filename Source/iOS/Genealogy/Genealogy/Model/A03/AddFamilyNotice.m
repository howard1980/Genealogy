//
//  AddFamilyNotice.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "AddFamilyNotice.h"

@interface AddFamilyNotice()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *content; /**< 通告内容*/
@property(nonatomic,strong)NSString *date; /**< 日期*/
@property(nonatomic,strong)NSString *time; /**< 时间*/
@property(nonatomic,strong)AddressInfoDTO *address; /**< 地点*/
@property(nonatomic,strong)NSArray *clansmanID; /**< 人员ID列表*/
@end
@implementation AddFamilyNotice

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsAddFamilyNotice";
        self.className = @"AddFamilyNotice";
    }
    return self;
}

- (void)postData:(NSString *)userID content:(NSString *)content date:(NSString *)date time:(NSString *)time address:(AddressInfoDTO *)address clansmanID:(NSArray *)clansmanID{
    self.userID = userID;
    self.content = content;
    self.date = date;
    self.time = time;
    self.address = address;
    self.clansmanID = clansmanID;
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
    if (self.content) {
        dic[@"content"] = self.content;
    }
    if (self.date) {
        dic[@"date"] = self.date;
    }
    if (self.time) {
        dic[@"time"] = self.time;
    }
    if (self.clansmanID.count>0) {
        dic[@"clansmanID"] = self.clansmanID;
    }
    NSDictionary *addressDic = [self.address buildRequestData];
    if (addressDic) {
        dic[@"address"] = addressDic;
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
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (self.userID.length<1) {
        [muArray addObject:@"用户ID不能为空!"];
        rest = NO;
    }
    if (self.content.length<1) {
        [muArray addObject:@"通告内容不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
