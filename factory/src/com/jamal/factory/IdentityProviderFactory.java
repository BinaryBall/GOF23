package com.jamal.factory;

/**
 * 第三方登陆抽象工厂
 */
public interface IdentityProviderFactory<T> {
    // 创建具体的IdentityProvider
    T create();
}
