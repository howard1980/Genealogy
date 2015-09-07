//
//  VersionController.m
//  Genealogy
//
//  Created by xiao huama on 15/9/7.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "VersionController.h"
#import "GetAppVersion.h"

@interface VersionController (){
    NSString * downloadUrl;
}

@end

@implementation VersionController

- (void)checkVersion{
    GetAppVersion *app = [[GetAppVersion alloc] init];
    NSNumber *version = [[NSNumber alloc] initWithInt:3];
    NSNumber *channel = [[NSNumber alloc] initWithInt:2];
    NSNumber *type = [[NSNumber alloc] initWithInt:1];
    app.delegate = self;
    [app postData:version channel:channel type:type];
}

- (void)successMethd:(BaseModel *)model{
    GetAppVersion *app = (GetAppVersion*)model;
    if (app.update) {
        UIAlertView *alertView = [[UIAlertView alloc]initWithTitle:@"检测到新版本" message:app.descrip delegate:self cancelButtonTitle:@"暂不更新" otherButtonTitles:@"去更新", nil];
        downloadUrl = app.downloadUrl;
        [alertView show];
    }
}

- (void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex
{
    if (buttonIndex == 1) {
        [[UIApplication sharedApplication] openURL:[NSURL URLWithString:downloadUrl]];
    }
}

- (void)errorMethd{
    
}
@end
