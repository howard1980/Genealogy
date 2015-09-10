//
//  GetClansmanTree.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "FamileyNoteDTO.h"

@interface GetClansmanTree : ServiceBaseModel

@property(nonatomic,strong)FamileyNoteDTO *famileyTree; /**< 家族树结构*/

- (void)postData:(NSString *)userID familyID:(NSString *)familyID;

@end
