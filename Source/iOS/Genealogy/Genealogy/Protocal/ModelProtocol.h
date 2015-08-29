//
//  ModelProtocal.h
//  Genealogy
//
//  Created by xiao huama on 15/8/29.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "BaseModel.h"

@protocol ModelProtocol

- (void)successMethd:(BaseModel *)model;
- (void)errorMethd;

@end
