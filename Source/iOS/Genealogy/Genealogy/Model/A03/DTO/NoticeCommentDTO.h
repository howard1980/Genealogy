//
//  NoticeCommentDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface NoticeCommentDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *userFace; /**< 用户头像*/
@property(nonatomic,strong)NSMutableString *userName; /**< 用户名*/
@property(nonatomic,strong)NSMutableString *date; /**< 评论日期*/
@property(nonatomic,strong)NSMutableString *time; /**< 评论时间*/
@property(nonatomic,strong)NSMutableString *comment; /**< 内容*/


@end
