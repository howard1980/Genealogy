//
//  MXHFrameWork.m
//  Genealogy
//
//  Created by xiao huama on 15/8/27.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "MXHFrameWork.h"
#import "Genealogy-swift.h"
#import "GuidViewController.h"

@interface MXHFrameWork ()
@property (nonatomic, readonly) UIWindow *mxhWindow;
@property (readwrite, nonatomic, strong) NSString *baseURL;
@end

@implementation MXHFrameWork

+(MXHFrameWork *)obj
{
    static MXHFrameWork *sharedSingleton = nil;
    static dispatch_once_t onceToken;
    dispatch_once(&onceToken,^(void) {
        sharedSingleton = [[self alloc] init];
    });
    return sharedSingleton;
}

-(id) init
{
    //读取plist文件：
    NSString *path = [[NSBundle mainBundle] pathForResource:@"configure" ofType:@"plist"];
    NSMutableDictionary* dict =  [[NSMutableDictionary alloc] initWithContentsOfFile:path ];
    self.baseURL = [dict objectForKey:@"BaseURL"];
    return [super init] ;
    
}

-(void) checkVersion{
    [self.checkVersionController checkVersion];
}

-(UIWindow*) window{

    _mxhWindow = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
    _mxhWindow.rootViewController=self.rootViewController;
    _mxhWindow.backgroundColor = [UIColor whiteColor];
    [_mxhWindow makeKeyAndVisible];
    
    return _mxhWindow;
}

-(UIViewController*)rootViewController{
    //读取plist文件：
    NSString *path = [[NSBundle mainBundle] pathForResource:@"configure" ofType:@"plist"];
    NSMutableDictionary* dict =  [[NSMutableDictionary alloc] initWithContentsOfFile:path ];
    
    // 首次打开确认
    int iFirst = [[dict objectForKey:@"AppFirstRun"] intValue];
    
    if (iFirst == 1) {
        // 确认是否已打开过
        if (![[[NSUserDefaults standardUserDefaults] objectForKey:@"isFirst"]isEqualToString:@"false"])
        {
            [[NSUserDefaults standardUserDefaults]setObject:@"false" forKey:@"isFirst"];
            
            return _guidViewController;
        }
    }

    // 是否需要登录确认
    Boolean bLogin = (Boolean)[dict objectForKey:@"IsLogin"];
    
    if(bLogin){
        // 确认是否已登录
        if (![[[NSUserDefaults standardUserDefaults] objectForKey:@"isLogin"]isEqualToString:@"true"])
        {
            if (_loginViewController){
                return _loginViewController;
            }
        }
    }
    
    self.navigationController = [[UINavigationController alloc]initWithRootViewController:_mainViewController];
    return _mainViewController;
    
    
}

@end
