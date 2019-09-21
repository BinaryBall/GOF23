package com.jamal.decorator;

import com.jamal.Food;

public class Potato extends FoodDecorator {
    String desc = "土豆";
    Food food;

    public Potato(Food food){
        this.food = food;
    }

    //　计算总价
    @Override
    public double cost() {
        return food.cost() + 2D;
    }

    @Override
    public String getDesc() {
        return food.getDesc()+" + "+this.desc;
    }
}
