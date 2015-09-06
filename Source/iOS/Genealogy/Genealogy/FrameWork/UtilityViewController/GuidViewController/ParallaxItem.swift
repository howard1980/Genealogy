//
//  ParallaxItem.swift
//  Genealogy
//
//  Created by xiao huama on 15/8/30.
//  Copyright (c) 2015年 xiao huama. All rights reserved.
//

import UIKit

class RMParallaxItem:NSObject {
    
    var image: UIImage!
    var text: String!
    
    init(image: UIImage, text: String) {
        self.image = image
        self.text = text
    }
    
}
