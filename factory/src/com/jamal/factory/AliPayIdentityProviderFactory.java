package com.jamal.factory;

import com.jamal.provider.AliPayIdentityProvider;
import com.jamal.provider.IdentityProvider;

/**
 * 支付宝第三方登陆工厂类
 */
public class AliPayIdentityProviderFactory extends IdentityProviderFactory<AliPayIdentityProvider> {
    @Override
    public IdentityProvider create() {

        return new AliPayIdentityProvider();
    }
}
