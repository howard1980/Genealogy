//
//  ServiceBaseModel.h
//  Genealogy
//
//  Created by xiao huama on 15/8/29.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "BaseModel.h"
#import "ModelProtocol.h"

@interface ServiceBaseModel : BaseModel{
    id<ModelProtocol> delegate;
}

@property (nonatomic, retain) id<ModelProtocol> delegate;

@end
