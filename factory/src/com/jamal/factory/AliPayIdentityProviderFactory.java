package com.jamal.factory;

import com.jamal.provider.AliPayIdentityProvider;

/**
 * 支付宝第三方登陆工厂类
 */
public class AliPayIdentityProviderFactory implements IdentityProviderFactory<AliPayIdentityProvider> {
    @Override
    public AliPayIdentityProvider create() {
        return new AliPayIdentityProvider();
    }
}
