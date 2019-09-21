package com.jamal;

/**
 * 核心抽象类
 */
public abstract class Food {

    String desc = "食物描述";

    public String getDesc() {
        return this.desc;
    }
    // 价格计算
    public abstract double cost();
}
