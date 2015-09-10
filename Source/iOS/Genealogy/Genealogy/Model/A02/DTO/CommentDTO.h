//
//  CommentDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"

@interface CommentDTO : ServiceBaseModel

@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 用户*/
@property(nonatomic,strong)NSMutableString *comment; /**< 评论*/


@end
