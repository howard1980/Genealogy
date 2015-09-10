//
//  UploadComment.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "UploadComment.h"

@interface UploadComment()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *actionID; /**< 活动ID*/
@property(nonatomic,strong)NSString *comment; /**< 评论*/
@end
@implementation UploadComment

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsUploadComment";
        self.className = @"UploadComment";
    }
    return self;
}

- (void)postData:(NSString *)userID actionID:(NSString *)actionID comment:(NSString *)comment{
    self.userID = userID;
    self.actionID = actionID;
    self.comment = comment;
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
    if (self.comment) {
        dic[@"comment"] = self.comment;
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
    if (self.actionID.length<1) {
        [muArray addObject:@"活动ID不能为空!"];
        rest = NO;
    }
    if (self.comment.length<1) {
        [muArray addObject:@"评论不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
