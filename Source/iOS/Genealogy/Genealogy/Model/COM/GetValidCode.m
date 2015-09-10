//
//  GetValidCode.m
//  Genealogy
//
//  Created by xiao huama on 15/09/10.
//  Xiao Hua Ma personal studio 2015.
//

#import "GetValidCode.h"

@interface GetValidCode()
@property(nonatomic,strong)NSString *mobile; /**< 手机号*/
@end
@implementation GetValidCode

- (instancetype)init
{
    self = [super init];
    if (self) {
        serviceMethod = @"FsGetValidCode";
        self.className = @"GetValidCode";
    }
    return self;
}

- (void)postData:(NSString *)mobile{
    self.mobile = mobile;
    [self requestWebService:^{
        if (delegate) {
            [delegate successMethd:self];
        }
    } faild:^{
        if (delegate) {
            [delegate errorMethd];
        }
    }];
}

-(NSMutableDictionary *)buildRequestData
{
    NSMutableDictionary *dic = [NSMutableDictionary dictionary];
    if (self.mobile) {
        dic[@"mobile"] = self.mobile;
    }
    return dic;
}

- (void)loadDataWithJsonData:(id)jsonData
{
    if (![jsonData isKindOfClass:[NSDictionary class]]) {
        return;
    }
    if (!jsonData) {
        return;
    }
}

-(BOOL)checkRequired
{
    NSMutableArray *muArray = [[NSMutableArray alloc] init];
    BOOL rest = YES;
    if (self.mobile.length<1) {
        [muArray addObject:@"手机号不能为空!"];
        rest = NO;
    }
    
    if (!rest){
        self.exceptions = muArray;
    }
    return rest;
}

@end
