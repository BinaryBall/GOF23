package com.jamal.provider;

/**
 * 微博账号登陆
 */
public class WeiBoIdentityProvider extends IdentityProvider{

    private static final String APPID = "你申请的运用id";
    private static final String APPKEY = "你的私钥";

    public WeiBoIdentityProvider() {
        System.out.println("我是微博第三方登陆具体实现");
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
