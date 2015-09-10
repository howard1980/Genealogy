//
//  CommentNotice.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "CommentNotice.h"

@interface CommentNotice()
@property(nonatomic,strong)NSString *userID; /**< 用户ID*/
@property(nonatomic,strong)NSString *noticeID; /**< 通告ID*/
@property(nonatomic,strong)NSString *comment; /**< 评论*/
@end
@implementation CommentNotice

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsCommentNotice";
        self.className = @"CommentNotice";
    }
    return self;
}

- (void)postData:(NSString *)userID noticeID:(NSString *)noticeID comment:(NSString *)comment{
    self.userID = userID;
    self.noticeID = noticeID;
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
    if (self.noticeID) {
        dic[@"noticeID"] = self.noticeID;
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
    if (self.noticeID.length<1) {
        [muArray addObject:@"通告ID不能为空!"];
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
