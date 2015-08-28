//
//  WelcomeViewController.m
//  Genealogy
//
//  Created by xiao huama on 15/8/27.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "WelcomeViewController.h"
#import "Constant.h"

@interface WelcomeViewController (){
    int _page;
}

@end

@implementation WelcomeViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
    
    self.navigationController.navigationBarHidden = YES;
    [self buildView];
}

-(void)buildView
{
    if (IPHONE4) {
        self.scrollView.frame =CGRectMake(0, 20, 324, 480-20);
    }else{
        self.scrollView.frame = CGRectMake(0, 20, 324, 568-20);
    }
    [self.scrollView setPagingEnabled:YES];
    [self.scrollView setDelegate:self];
    [self.scrollView setShowsHorizontalScrollIndicator:NO];
    [self.view addSubview:self.scrollView];
    NSString *string1 = nil;
    NSString *string2 = nil;
    NSString *string3 = nil;
    NSString *string4 = nil;
    string1 = @"欢1";
    string2 = @"欢2";
    string3 = @"欢3";
    string4 = @"欢4新";
    
    UIImageView *imageView1 = [[UIImageView alloc]init];
    if (IPHONE4) {
        imageView1.frame = CGRectMake(0, 0, 320, 480-20);
    }else{
        imageView1.frame = CGRectMake(0, 0, 320, 568-20);
    }
    imageView1.image = [UIImage imageNamed:string1];
    [self.scrollView addSubview:imageView1];
    UIImageView *imageView2 = [[UIImageView alloc]init];
    if (IPHONE4) {
        imageView2.frame = CGRectMake(320, 0, 320, 480-20);
    }else{
        imageView2.frame = CGRectMake(320, 0, 320, 568-20);
    }
    imageView2.image = [UIImage imageNamed:string2];
    [self.scrollView addSubview:imageView2];
    UIImageView *imageView3 = [[UIImageView alloc]init];
    if (IPHONE4) {
        imageView3.frame = CGRectMake(640, 0, 320, 480-20);
    }else{
        imageView3.frame = CGRectMake(640, 0, 320, 568-20);
    }
    imageView3.image = [UIImage imageNamed:string3];
    [self.scrollView addSubview:imageView3];
    UIImageView *imageView4 = [[UIImageView alloc]init];
    if (IPHONE4) {
        imageView4.frame = CGRectMake(960, 0, 320, 480-20);
    }else{
        imageView4.frame = CGRectMake(960, 0, 320, 568-20);
    }
    imageView4.image = [UIImage imageNamed:string4];
    [self.scrollView addSubview:imageView4];
    if (IPHONE4) {
        self.scrollView.contentSize = CGSizeMake(320*4, 480-20);
    }else{
        self.scrollView.contentSize = CGSizeMake(320*4, 568-20);
    }
    [self.scrollView addSubview:[self customView]];
}

- (UIView *)customView
{
    UIView *view = [[UIView alloc] initWithFrame:CGRectMake(640, 0, 320, 705)];
    view.backgroundColor = [UIColor clearColor];
    //80  990/2 170 30 836
    
    UIButton *btn = [UIButton buttonWithType:UIButtonTypeCustom];
    if (IPHONE4) {
        btn.frame = CGRectMake(0,0, 320, 600);
    }else{
        btn.frame = CGRectMake(0, 0, 320, 600);
    }
    [btn addTarget:self action:@selector(welComeBtnClick:) forControlEvents:UIControlEventTouchUpInside];
    btn.backgroundColor = [UIColor clearColor];
    [view addSubview:btn];
    
    return view;
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)welComeBtnClick:(id)sender
{
    NSLog(@"asdasdasdasdasd");
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
