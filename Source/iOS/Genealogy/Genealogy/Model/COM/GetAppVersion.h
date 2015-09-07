//
//  CheckVersion.h
//  Genealogy
//
//  Created by xiao huama on 15/9/7.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ServiceBaseModel.h"
#import "CheckVersionProtocol.h"

@interface GetAppVersion : ServiceBaseModel

@property(nonatomic,strong)NSNumber *update; /**< 是否更新*/
@property(nonatomic,strong)NSMutableString *descrip; /**< 提示描述*/
@property(nonatomic,strong)NSMutableString *downloadUrl; /**< 下载地址*/

- (void)postData:(NSNumber *)version channel:(NSNumber *)channel type:(NSNumber *)type;
@end
