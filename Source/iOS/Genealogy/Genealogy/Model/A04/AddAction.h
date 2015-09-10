//
//  AddAction.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"
#import "ActionDTO.h"

@interface AddAction : ServiceBaseModel


- (void)postData:(NSString *)userID action:(ActionDTO *)action;

@end
