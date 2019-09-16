package com.jamal.provider;

/**
 * GitHub 第三方登陆具体实现
 */
public class QQIdentityProvider implements IdentityProvider{

    public QQIdentityProvider() {
        System.out.println("我是QQ第三方登陆具体实现");
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
