//
//  FamilyInfoDTO.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface FamilyInfoDTO : ServiceBaseModel

@property(nonatomic,strong)NSMutableString *familyID; /**< 家族ID*/
@property(nonatomic,strong)NSMutableString *arms; /**< 族徽*/
@property(nonatomic,strong)NSMutableString *famileyName; /**< 族姓*/
@property(nonatomic,strong)NSMutableString *introductionText; /**< 介绍（文字）*/
@property(nonatomic,strong)NSMutableString *introductionPicture; /**< 介绍（图片）*/
@property(nonatomic,strong)NSMutableString *introductionVideo; /**< 介绍（视频）*/


@end
