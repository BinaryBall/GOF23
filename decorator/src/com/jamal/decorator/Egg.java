package com.jamal.decorator;

import com.jamal.Food;

public class Egg extends FoodDecorator {
    String desc = "鸡蛋";
    // 存放Component对象，该对象可能是被装饰后的
    Food food;

    public Egg(Food food){
        this.food = food;
    }

    //　计算总价　当前Component对象的价格加上当前装饰者的价格
    @Override
    public double cost() {
        return food.cost() + 2D;
    }

    @Override
    public String getDesc() {
        return food.getDesc()+" + "+this.desc;
    }
}
