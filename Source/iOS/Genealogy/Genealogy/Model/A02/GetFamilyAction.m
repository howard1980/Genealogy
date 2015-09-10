//
//  GetFamilyAction.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetFamilyAction.h"

@interface GetFamilyAction()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *familyID; /**< 家族ID*/
@property(nonatomic,strong)NSNumber *pageIndex; /**< 页数*/
@end
@implementation GetFamilyAction

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetFamilyAction";
        self.className = @"GetFamilyAction";
    }
    return self;
}

- (void)postData:(NSString *)userID familyID:(NSString *)familyID pageIndex:(NSNumber *)pageIndex{
    self.userID = userID;
    self.familyID = familyID;
    self.pageIndex = pageIndex;
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
    if (self.pageIndex) {
        dic[@"pageIndex"] = self.pageIndex;
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
    if ([jsonData[@"actions"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"actions"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"actions"]) {
                [tempArray addObject:[[ViewActionDTO alloc]initWithJsonData:data]];
            }
            self.actions = tempArray;
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
    if (self.familyID.length<1) {
        [muArray addObject:@"家族ID不能为空!"];
        rest = NO;
    }
    if (!self.pageIndex) {
        [muArray addObject:@"页数不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
