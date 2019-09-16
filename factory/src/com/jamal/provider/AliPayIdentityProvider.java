package com.jamal.provider;

/**
 * 支付宝 第三方登陆具体实现
 */
public class AliPayIdentityProvider implements IdentityProvider{

    private static final String APPID = "你申请的运用id";
    private static final String APPKEY = "你的私钥";

    public AliPayIdentityProvider() {
        System.out.println("我是支付宝第三方登陆具体实现");
    }

    @Override
    public void callback() {

    }

    @Override
    public void authorizationCode() {
        //
    }

    @Override
    public void accessToken() {

    }
}
