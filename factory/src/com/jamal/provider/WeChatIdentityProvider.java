package com.jamal.provider;

/**
 * GitHub 第三方登陆具体实现
 */
public class WeChatIdentityProvider implements IdentityProvider{

    public WeChatIdentityProvider() {
        System.out.println("我是微信第三方登陆具体实现");
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
