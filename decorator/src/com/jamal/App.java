package com.jamal;

import com.jamal.decorator.Veg;
import com.jamal.decorator.Egg;
import com.jamal.decorator.Mushroom;
import com.jamal.decorator.Potato;

public class App {
    public static void main(String[] args) {
        // 点一份米饭
        Rice rice = new Rice();
        // 加个鸡蛋
        Egg egg = new Egg(rice);
        // 在加土豆
        Potato potato = new Potato(egg);
        // 再加一份白菜
        Veg veg = new Veg(potato);
        System.out.println("客户点的黄焖鸡米饭套餐："+veg.getDesc());
        System.out.println("总金额："+veg.cost());

//        // 来一份黄焖排骨
//        Ribs ribs = new Ribs();
//        // 加一份香菇
//        Mushroom mushroom = new Mushroom(ribs);
//        // 在加土豆
//        Potato potato1 = new Potato(mushroom);
//        System.out.println(potato1.getDesc());
//        System.out.println(potato1.cost());
    }
}
