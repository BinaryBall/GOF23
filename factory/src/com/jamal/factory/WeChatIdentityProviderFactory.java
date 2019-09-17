package com.jamal.factory;

import com.jamal.provider.WeChatIdentityProvider;

/**
 * 微信第三方登陆工厂类
 */
public class WeChatIdentityProviderFactory extends IdentityProviderFactory<WeChatIdentityProvider>{
    @Override
    public WeChatIdentityProvider create() {

        return new WeChatIdentityProvider();
    }
}
