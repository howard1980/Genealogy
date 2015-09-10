//
//  SsBaseModel.m
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "BaseModel.h"
#import "AFHTTPRequestOperationManager.h"
#import "MXHFrameWork.h"
#import "Constant.h"

@implementation BaseModel

- (instancetype)initWithJsonData:(id)jsonData
{
    self = [super init];
    if (self) {
        [self loadDataWithJsonData:jsonData];
    }
    return self;
}

- (void)loadDataWithJsonData:(id)jsonData
{
    
}

- (NSMutableDictionary *)buildRequestData{
    return nil;
}

- (BOOL)checkRequired{
    return YES;
}

-(void)requestWebService:(void (^)(void))block faild:(void (^)(void))faild{
    if (![self checkRequired]) {
        if (faild) {
            faild();
        }
        return;
    }
    
    AFHTTPRequestOperationManager *manager = [AFHTTPRequestOperationManager manager];
    manager.responseSerializer = [AFJSONResponseSerializer serializer];
    manager.requestSerializer=[AFJSONRequestSerializer serializer];
    manager.responseSerializer.acceptableContentTypes = [NSSet setWithObject:@"application/json"];
    NSDictionary *postJsonDic =[self buildRequestData];
    NSLog(@"post json == %@", postJsonDic);
    
    NSString* url = [NSString stringWithFormat:@"%@%@", MXHFrameWork.obj.baseURL, serviceMethod ];
    [manager POST:url parameters:postJsonDic success:^(AFHTTPRequestOperation *operation, id responseObject) {
        NSLog(@"%@",operation.responseString);
        NSDictionary *dic = [NSJSONSerialization JSONObjectWithData:operation.responseData options:kNilOptions error:nil];
        
        self.success = [dic[@"success"] boolValue];
        self.exceptions = nil;
        
        if (self.success) {
            [self loadDataWithJsonData:dic[@"result"]];
            if (block) {
                block();
            }
        }else{
            self.exceptions = dic[@"exceptions"];
            
            if (faild) {
                faild();
            }
        }
    } failure:^(AFHTTPRequestOperation *operation, NSError *error) {
        self.exceptions = [NSArray arrayWithObject:@"网络连接失败！"];
        if (faild) {
            faild();
        }
        NSLog(@"%@",error);
    }];
}
@end
