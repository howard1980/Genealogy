//
//  GetClansman.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetClansman.h"

@interface GetClansman()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@end
@implementation GetClansman

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetClansman";
        self.className = @"GetClansman";
    }
    return self;
}

- (void)postData:(NSString *)userID{
    self.userID = userID;
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
    if ([jsonData[@"cleansmen"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"cleansmen"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"cleansmen"]) {
                [tempArray addObject:[[CleansmanDTO alloc]initWithJsonData:data]];
            }
            self.cleansmen = tempArray;
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
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
