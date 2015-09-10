//
//  GetFamilyNotice.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetFamilyNotice.h"

@interface GetFamilyNotice()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSNumber *state; /**< 状态*/
@property(nonatomic,strong)NSNumber *pages; /**< 页数*/
@end
@implementation GetFamilyNotice

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetFamilyNotice";
        self.className = @"GetFamilyNotice";
    }
    return self;
}

- (void)postData:(NSString *)userID state:(NSNumber *)state pages:(NSNumber *)pages{
    self.userID = userID;
    self.state = state;
    self.pages = pages;
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
    if (self.state) {
        dic[@"state"] = self.state;
    }
    if (self.pages) {
        dic[@"pages"] = self.pages;
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
    if ([jsonData[@"noticeArray"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"noticeArray"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"noticeArray"]) {
                [tempArray addObject:[[NoticeDTO alloc]initWithJsonData:data]];
            }
            self.noticeArray = tempArray;
        }
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
    if (!self.state) {
        [muArray addObject:@"状态不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
