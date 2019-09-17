package com.jamal.factory;

import com.jamal.provider.IdentityProvider;

/**
 * 第三方登陆抽象工厂
 */
public abstract class IdentityProviderFactory<T> {
    // 创建具体的IdentityProvider
    public abstract IdentityProvider create();
}
