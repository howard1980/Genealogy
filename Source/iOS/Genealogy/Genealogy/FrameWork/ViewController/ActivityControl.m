//
//  ActivityControl.m
//  Genealogy
//
//  Created by xiao huama on 15/9/7.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "ActivityControl.h"

@implementation ActivityControl
{
@private
    UIView * bgView;
    BOOL isShow;//是否正在展示
}
/*
 // Only override drawRect: if you perform custom drawing.
 // An empty implementation adversely affects performance during animation.
 - (void)drawRect:(CGRect)rect {
 // Drawing code
 }
 */
+(ActivityControl *)sharedControl{
    static ActivityControl * manager;
    if (manager==nil) {
        manager = [[ActivityControl alloc]init];
    }
    return manager;
}
- (instancetype)init
{
    self = [super init];
    if (self) {
        
        //iphone中获取屏幕分辨率的方法
        CGRect rect = [[UIScreen mainScreen] bounds];
        CGSize size = rect.size;
        
        bgView = [[UIView alloc]initWithFrame:CGRectMake(0, 0, size.width, size.height)];
        bgView.backgroundColor = [UIColor colorWithRed:0 green:0 blue:0 alpha:0.5];
        UIActivityIndicatorView * acti = [[UIActivityIndicatorView alloc]initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleWhiteLarge];
        [acti startAnimating];
        acti.center=CGPointMake(size.width/2, size.height/2);
        [bgView addSubview:acti];
    }
    return self;
}

-(void)show{
    if (isShow) {
        return;
    }
    isShow=YES;
    [[[UIApplication sharedApplication].delegate window]addSubview:bgView];
}
-(void)unShow{
    if (isShow) {
        [bgView removeFromSuperview];
        isShow=NO;
    }
}

@end
