package com.jamal;

import com.jamal.factory.AliPayIdentityProviderFactory;
import com.jamal.factory.IdentityProviderFactory;
import com.jamal.provider.IdentityProvider;

public class App {
    public static void main(String[] args) {

        // github
        IdentityProvider identityProvider = IdentityFactory.create(4);
        // 微信
        IdentityFactory.create(2);
        // QQ
        IdentityFactory.create(3);
        // 支付宝
        IdentityFactory.create(1);
//        // github
//        IdentityProviderFactory providerFactory = new GitHubIdentityProviderFactory();
//        providerFactory.create();
//        // 微信
//        providerFactory = new WeChatIdentityProviderFactory();
//        providerFactory.create();
//        // QQ
//        providerFactory = new QQIdentityProviderFactory();
//        providerFactory.create();
//
//        // 支付宝
        IdentityProviderFactory providerFactory  = new AliPayIdentityProviderFactory();
        IdentityProvider aliPayIdentityProvider = providerFactory.create();
    }
}
