//
//  GetActionComment.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetActionComment.h"

@interface GetActionComment()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *actionID; /**< 活动ID*/
@end
@implementation GetActionComment

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetActionComment";
        self.className = @"GetActionComment";
    }
    return self;
}

- (void)postData:(NSString *)userID actionID:(NSString *)actionID{
    self.userID = userID;
    self.actionID = actionID;
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
    if (self.actionID) {
        dic[@"actionID"] = self.actionID;
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
    if ([jsonData[@"comments"] isKindOfClass:[NSArray class]]) {
        if ([jsonData[@"comments"] count]>0) {
            NSMutableArray *tempArray = [NSMutableArray array];
            for (id data in jsonData[@"comments"]) {
                [tempArray addObject:[[CommentDTO alloc]initWithJsonData:data]];
            }
            self.comments = tempArray;
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
    if (self.actionID.length<1) {
        [muArray addObject:@"活动ID不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
