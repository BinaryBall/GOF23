package com.jamal.decorator;

import com.jamal.Food;

public class Mushroom extends FoodDecorator {
    String desc = "香菇";
    Food food;

    public Mushroom(Food food){
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
