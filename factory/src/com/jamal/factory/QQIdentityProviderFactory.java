package com.jamal.factory;

import com.jamal.provider.QQIdentityProvider;

/**
 * qq 第三方登陆工厂类
 */
public class QQIdentityProviderFactory implements IdentityProviderFactory<QQIdentityProvider>{
    @Override
    public QQIdentityProvider create() {
        return new QQIdentityProvider();
    }
}
