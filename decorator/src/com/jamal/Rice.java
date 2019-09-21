package com.jamal;

/**
 * 被装饰者－黄焖鸡米饭
 */
public class Rice extends Food{
    public Rice(){
        this.desc ="黄焖鸡米饭";
    }

    @Override
    public double cost() {
        // 黄焖鸡米饭的价格
        return 16D;
    }
}
