//
//  GetAppVersion.h
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//
#import "ServiceBaseModel.h"

@interface GetAppVersion : ServiceBaseModel

@property(nonatomic,strong)NSNumber *update; /**< 是否更新*/
@property(nonatomic,strong)NSMutableString *descrip; /**< 提示描述*/
@property(nonatomic,strong)NSMutableString *downloadUrl; /**< 下载地址*/

- (void)postData:(NSNumber *)version channel:(NSNumber *)channel type:(NSNumber *)type;

@end
