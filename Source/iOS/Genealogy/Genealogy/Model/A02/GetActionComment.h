//
//  GetActionComment.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "CommentDTO.h"

@interface GetActionComment : ServiceBaseModel

@property(nonatomic,strong)NSMutableArray *comments; /**< 事件评论*/

- (void)postData:(NSString *)userID actionID:(NSString *)actionID;

@end
