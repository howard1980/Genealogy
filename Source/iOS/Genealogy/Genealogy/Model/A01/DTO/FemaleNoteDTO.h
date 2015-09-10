//
//  FemaleNoteDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "UserInfoDTO.h"
#import "FamileyNoteDTO.h"

@interface FemaleNoteDTO : ServiceBaseModel

@property(nonatomic,strong)UserInfoDTO *userInfo; /**< 母亲信息*/
@property(nonatomic,strong)NSMutableArray *familey; /**< 自家庭信息*/


@end
