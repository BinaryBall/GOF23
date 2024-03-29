package com.jamal.provider;

/**
 * 支付宝 第三方登陆具体实现
 */
public class AliPayIdentityProvider extends IdentityProvider{

    private static final String APPID = "你申请的运用id";
    private static final String APPKEY = "你的私钥";

    public AliPayIdentityProvider() {
        System.out.println("我是支付宝第三方登陆具体实现");
    }

    @Override
    public void callback() {
        // 回调处理
    }

    @Override
    public void authorizationCode() {
        //获取authorization Code
    }

    @Override
    public void accessToken() {
        //获取access Token
    }
}
