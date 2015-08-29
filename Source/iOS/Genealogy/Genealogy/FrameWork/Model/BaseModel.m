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

- (void)loadDataWithJsonData:(id)jsonData
{
    
}

- (NSMutableDictionary *)buildRequestData{
    return nil;
}

-(void)requestWebService:(void (^)(void))block faild:(void (^)(void))faild{
    AFHTTPRequestOperationManager *manager = [AFHTTPRequestOperationManager manager];
    manager.responseSerializer = [AFJSONResponseSerializer serializer];
    manager.requestSerializer=[AFJSONRequestSerializer serializer];
    manager.responseSerializer.acceptableContentTypes = [NSSet setWithObject:@"application/json"];
    NSDictionary *postJsonDic =[self buildRequestData];
    NSLog(@"post json == %@", postJsonDic);
    
    [manager POST:MXHFrameWork.obj.baseURL parameters:postJsonDic success:^(AFHTTPRequestOperation *operation, id responseObject) {
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
            
//            if (exceptionsArray.count>0) {
//                NSDictionary *exceptionDic = exceptionsArray[0];
//                if ([exceptionDic[@"type"] isEqualToString:@"E"]) {
////                    ALERT_VIEW(exceptionDic[@"message"]);
//                }else{
//                    
//                }
//
//            }
            
        }
    } failure:^(AFHTTPRequestOperation *operation, NSError *error) {
        self.exceptions = [NSArray arrayWithObject:@"网络连接失败！"];
        if (faild) {
            faild();
        }
        NSLog(@"%@",error);
        //EndLoading;
    }];
//    if (!self.notShowLoading) {
//        BeginLoading(self.loadingString);
//    }
}
@end
