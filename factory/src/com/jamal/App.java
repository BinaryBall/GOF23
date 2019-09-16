package com.jamal;

import com.jamal.factory.*;
import com.jamal.provider.IdentityProvider;

public class App {
    public static void main(String[] args) {

        // github
        Identity identity = new Identity();
        identity.crete(4);
        // 微信
        identity.crete(2);
        // QQ
        identity.crete(3);
        // 支付宝
        identity.crete(1);
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
//        providerFactory = new AliPayIdentityProviderFactory();
//        providerFactory.create();
    }
}
