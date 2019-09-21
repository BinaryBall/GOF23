package com.jamal;

import com.jamal.Food;

/**
 * 黄焖鸡米饭
 */
public class Ribs extends Food{
    public Ribs(){
        this.desc ="黄焖排骨";
    }

    @Override
    public double cost() {
        return 18.5D;
    }
}
