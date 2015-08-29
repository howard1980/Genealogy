//
//  LoginViewController.m
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import "LoginViewController.h"
#import "ValidCode.h"

@interface LoginViewController ()

@end

@implementation LoginViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)getValidCode:(id)sender {
    
    ValidCode *vc = [[ValidCode alloc] init];
    vc.delegate = self;
    [vc postData:self.txtPhone.text];
}

- (IBAction)login:(id)sender {
    
}

- (void)successMethd:(BaseModel *)model{
    
}

- (void)errorMethd{
    
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
