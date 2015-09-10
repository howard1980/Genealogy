//
//  FamileyNoteDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"
#import "FemaleNoteDTO.h"

@interface FamileyNoteDTO : ServiceBaseModel

@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 父亲信息*/
@property(nonatomic,strong)NSMutableArray *wives; /**< 配偶信息*/
@property(nonatomic,strong)NSNumber *weight; /**< 权重*/
@property(nonatomic,strong)NSNumber *plies; /**< 子层数*/


@end
