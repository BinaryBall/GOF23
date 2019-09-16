package com.jamal;


import com.jamal.provider.*;

public class Identity {
    /**
     * 第三方登陆验证
     * @param type 标识符，1：支付宝登陆 2：微信登陆 3：QQ登录 4：github登陆
     */
    public IdentityProvider crete(int type){
        IdentityProvider identityProvider = null;
        switch (type){
            case 1:
                identityProvider = new AliPayIdentityProvider();
                break;
            case 2:
                identityProvider = new WeChatIdentityProvider();
                break;
            case 3:
                identityProvider = new QQIdentityProvider();
                break;
            case 4:
                identityProvider = new GitHubIdentityProvider();
                break;
        }
        return identityProvider;
    }
}
