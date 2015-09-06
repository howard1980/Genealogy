//
//  GuidViewController1.m
//  Genealogy
//
//  Created by xiao huama on 15/8/30.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "GuidViewController.h"
#import "AppDelegate.h"
#import "MXHFrameWork.h"
#import "Constant.h"

@interface GuidViewController ()

@end

@implementation GuidViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    RMParallaxItem *item1 = [[RMParallaxItem alloc] initWithImage:[UIImage imageNamed:@"item1"] text:@"SHARE LIGHTBOXES WITH YOUR TEAM"];
    RMParallaxItem *item2 = [[RMParallaxItem alloc] initWithImage:[UIImage imageNamed:@"item2"] text:@"FOLLOW WORLD CLASS PHOTOGRAPHERS"];
    RMParallaxItem *item3 = [[RMParallaxItem alloc] initWithImage:[UIImage imageNamed:@"item3"] text:@"EXPLORE OUR COLLECTION BY CATEGORY"];
    
    NSArray *array = [[NSArray alloc]initWithObjects:item1,item2,item3,nil];
    RMParallax *rmParallaxViewController = [[RMParallax alloc] initWithItems:array motion:NO];

    rmParallaxViewController.completionHandler = ^{
        AppDelegate *app = (AppDelegate *)[UIApplication sharedApplication].delegate;
        app.window = MXHFrameWork.obj.window;
    };
    
    [self addChildViewController:rmParallaxViewController];
    [self.view addSubview:rmParallaxViewController.view];
    [rmParallaxViewController didMoveToParentViewController:self];

//    UIView *heng1 = [[UIView alloc]initWithFrame:CGRectMake(0, 135, 320, 1)];
//    heng1.backgroundColor = UIColorFromRGB(0xCECECE);
//    [self.view addSubview:rmParallaxViewController];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (BOOL)prefersStatusBarHidden{
    return YES;
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
