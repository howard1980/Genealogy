//
//  MXHFrameWork.h
//  Genealogy
//
//  Created by xiao huama on 15/8/27.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "CheckVersionProtocol.h"

@interface MXHFrameWork: NSObject

@property (strong, nonatomic) UIViewController *loginViewController;
@property (strong, nonatomic) UIViewController *mainViewController;
@property (strong, nonatomic) UIViewController *guidViewController;
@property (strong, nonatomic) UINavigationController *navigationController;
@property (strong, nonatomic) NSObject<CheckVersionProtocol> *checkVersionController;
@property (nonatomic, readonly) UIViewController *rootViewController;
@property (nonatomic, readonly) UIWindow *window;
@property (readonly, nonatomic, strong) NSString *baseURL;

+(MXHFrameWork *)obj;

-(void) checkVersion;

@end

