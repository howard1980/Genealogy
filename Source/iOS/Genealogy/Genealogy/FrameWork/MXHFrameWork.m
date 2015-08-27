//
//  MXHFrameWork.m
//  Genealogy
//
//  Created by xiao huama on 15/8/27.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "MXHFrameWork.h"

@interface MXHFrameWork ()

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
    return [super init] ;
}

-(UIWindow*) window{
    if (!_window) {
        _window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
        _window.rootViewController=self.navigationController;
        _window.backgroundColor = [UIColor whiteColor];
        [_window makeKeyAndVisible];
    }
    return _window;
}

@end
