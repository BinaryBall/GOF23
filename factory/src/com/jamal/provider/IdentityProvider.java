package com.jamal.provider;


public interface IdentityProvider {

    // 获取Authorization Code
    void authorizationCode();

    // 获取 Access Token
    void accessToken();

    // 这里会有很多方法
    void callback();
}
