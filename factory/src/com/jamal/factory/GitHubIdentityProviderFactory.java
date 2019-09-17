package com.jamal.factory;

import com.jamal.provider.GitHubIdentityProvider;

/**
 * github 第三方登陆工厂类
 */
public class GitHubIdentityProviderFactory extends IdentityProviderFactory<GitHubIdentityProvider>{
    @Override
    public GitHubIdentityProvider create() {
        return new GitHubIdentityProvider();
    }
}
