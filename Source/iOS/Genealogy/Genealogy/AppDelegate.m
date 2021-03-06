//
//  AppDelegate.m
//  Genealogy
//
//  Created by xiao huama on 15/8/26.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "AppDelegate.h"
#import "MXHFrameWork.h"
#import "MainViewController.h"
#import "LoginViewController.h"
#import "GuidViewController.h"
#import "VersionController.h"

@interface AppDelegate (){
    NSString * downloadUrl;
}

@end

@implementation AppDelegate


- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    // 欢迎画面
    MXHFrameWork.obj.guidViewController     = [[GuidViewController alloc] init];
    
    // 登陆画面
    MXHFrameWork.obj.loginViewController    = [[LoginViewController alloc] init];
    
    // 主画面
    MXHFrameWork.obj.mainViewController     = [[MainViewController alloc] init];
    
    MXHFrameWork.obj.checkVersionController = [[VersionController alloc] init];
    
    [MXHFrameWork.obj checkVersion];
    
    // 启动程序
    self.window = MXHFrameWork.obj.window;
    NSString *url;
    [[UIApplication sharedApplication]openURL:[NSURL URLWithString:url]];
    
    return YES;
}

- (void)applicationWillResignActive:(UIApplication *)application {
    // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
    // Use this method to pause ongoing tasks, disable timers, and throttle down OpenGL ES frame rates. Games should use this method to pause the game.
}

- (void)applicationDidEnterBackground:(UIApplication *)application {
    // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
    // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
}

- (void)applicationWillEnterForeground:(UIApplication *)application {
    // Called as part of the transition from the background to the inactive state; here you can undo many of the changes made on entering the background.
}

- (void)applicationDidBecomeActive:(UIApplication *)application {
    // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
}

- (void)applicationWillTerminate:(UIApplication *)application {
    // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
}

@end
