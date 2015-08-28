//
//  MXHFrameWork.h
//  Genealogy
//
//  Created by xiao huama on 15/8/27.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface MXHFrameWork: NSObject

@property (strong, nonatomic) UIViewController *loginViewController;
@property (strong, nonatomic) UIViewController *mainViewController;
@property (strong, nonatomic) UINavigationController *navigationController;
@property (nonatomic, readonly) UIViewController *rootViewController;
@property (nonatomic, readonly) UIWindow *window;

+(MXHFrameWork *)obj;

@end

