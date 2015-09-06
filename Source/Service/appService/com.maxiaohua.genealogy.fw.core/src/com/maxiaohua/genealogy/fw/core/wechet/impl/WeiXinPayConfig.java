package com.maxiaohua.genealogy.fw.core.wechet.impl;

public class WeiXinPayConfig {
	// 支付完成后的回调处理页面
	//public static String NOTIFY_URL = "http://115.28.140.128:8080/carService/admin/weixinpay/notify";
	public static String NOTIFY_URL = "http://howard19980.oicp.net:8080/SxManagerServer/admin/weixinpay/notify";
	//public static String NOTIFY_URL = "http://howard19980.oicp.net:8080/carService/admin/weixinpay/notify";
    
    public static String APP_ID = "wxc3a9e44aba7e5810";

    public static String APP_SECRET = "bcc8ecdea06d919ef8a1e055d52a3a73";

    public static String APP_KEY = "9dBVT430aPcls5hlVt8opsn1JqrxHEZAYY3j8QKY4nbPenjt9SJcRf47Py1qyaIYYMENgg8g8K0xLCqbQfIYaMkSxJg0151uTIUHH8C0g6FR1RPdAqKLk7sQZo7Wl5PB";

	// 商户号
    public static String PARTNER = "1229213601";

	// 密钥
    public static String PARTNER_KEY = "ccbe3d4fd2ead3bfcad2d91ceb3e5b8f";
    
    public static String SIGN_METHOD = "sha1";//签名算法常量值
    
    public static String GATEURL = "https://api.weixin.qq.com/pay/genprepay?access_token=";//获取预支付id的接口url
}
