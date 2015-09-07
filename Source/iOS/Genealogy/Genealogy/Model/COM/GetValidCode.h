//
//  ValidCode.h
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ServiceBaseModel.h"

@interface GetValidCode : ServiceBaseModel

- (void)postData:(NSString *)mobile;

@end
