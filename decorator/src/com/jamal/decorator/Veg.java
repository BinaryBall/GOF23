package com.jamal.decorator;

import com.jamal.Food;

public class Veg extends FoodDecorator {
    String desc = "蔬菜";
    Food food;

    public Veg(Food food){
        this.food = food;
    }

    //　计算总价
    @Override
    public double cost() {
        return food.cost() + 1.5D;
    }

    @Override
    public String getDesc() {
        return food.getDesc()+" + "+this.desc;
    }
}
