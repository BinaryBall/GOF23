package com.jamal.provider;


public abstract class IdentityProvider {

    // 获取Authorization Code
    abstract void authorizationCode();

    // 获取 Access Token
    abstract void accessToken();

    // 这里会有很多方法
    abstract void callback();
}
