//
//  UploadComment.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface UploadComment : ServiceBaseModel


- (void)postData:(NSString *)userID actionID:(NSString *)actionID comment:(NSString *)comment;

@end
