//
//  PhoneNoteDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface PhoneNoteDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *name; /**< 用户名*/
@property(nonatomic,strong)NSMutableString *phone; /**< 电话号*/


@end
