//
//  SsBaseModel.h
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BaseModel : NSObject
{
    NSString *serviceMethod;
    
}

@property (nonatomic) NSString *className;


@property (nonatomic) BOOL success;
@property (nonatomic) NSArray *exceptions;

- (NSMutableDictionary *)buildRequestData;
- (void)loadDataWithJsonData:(id)jsonData;
- (void)requestWebService:(void (^)(void))block faild:(void (^)(void))faild;

@end
