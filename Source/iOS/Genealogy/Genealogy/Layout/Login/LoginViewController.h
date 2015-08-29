//
//  LoginViewController.h
//  Genealogy
//
//  Created by xiao huama on 15/8/28.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ModelProtocol.h"

@interface LoginViewController : UIViewController<ModelProtocol>
@property (weak, nonatomic) IBOutlet UITextField *txtPhone;
@property (weak, nonatomic) IBOutlet UITextField *txtValidCode;

@end
