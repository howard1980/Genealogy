//
//  ActivityControl.h
//  Genealogy
//
//  Created by xiao huama on 15/9/7.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ActivityControl : NSObject
+(ActivityControl *)sharedControl;
-(void)show;
-(void)unShow;
@end
