//
//  MainViewController.m
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "MainViewController.h"

@interface MainViewController ()

@end

@implementation MainViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    //b.创建子控制器
    UIViewController *c1=[[UIViewController alloc]init];
    c1.view.backgroundColor=[UIColor grayColor];
    c1.view.backgroundColor=[UIColor greenColor];
    c1.tabBarItem.title=@"消息";
    c1.tabBarItem.image=[UIImage imageNamed:@"tab_recent_nor"];
    c1.tabBarItem.badgeValue=@"123";
    
    UIViewController *c2=[[UIViewController alloc]init];
    c2.view.backgroundColor=[UIColor brownColor];
    c2.tabBarItem.title=@"联系人";
    c2.tabBarItem.image=[UIImage imageNamed:@"tab_buddy_nor"];
    
    UIViewController *c3=[[UIViewController alloc]init];
    c3.tabBarItem.title=@"动态";
    c3.tabBarItem.image=[UIImage imageNamed:@"tab_qworld_nor"];

    UIViewController *c4=[[UIViewController alloc]init];
    c4.tabBarItem.title=@"设置";
    c4.tabBarItem.image=[UIImage imageNamed:@"tab_me_nor"];
    
    //c.添加子控制器到ITabBarController中
    //c.1第一种方式
    [self addChildViewController:c1];
    [self addChildViewController:c2];
    [self addChildViewController:c3];
    [self addChildViewController:c4];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
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
