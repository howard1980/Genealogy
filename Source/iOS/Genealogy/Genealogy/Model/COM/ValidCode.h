//
//  ValidCode.h
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ServiceBaseModel.h"

@interface ValidCode : ServiceBaseModel

- (void)postData:(NSString *)phone;

@end
