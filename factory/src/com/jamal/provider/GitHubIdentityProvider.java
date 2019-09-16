package com.jamal.provider;

/**
 * GitHub 第三方登陆具体实现
 */
public class GitHubIdentityProvider implements IdentityProvider{

    public GitHubIdentityProvider() {
        System.out.println("我是GitHub第三方登陆具体实现");
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
