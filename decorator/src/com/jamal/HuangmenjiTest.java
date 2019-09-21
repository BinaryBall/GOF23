package com.jamal;

public class HuangmenjiTest {
    public static void main(String[] args) {
        HuangMenJiMiFan huangMenJiMiFan = new HuangMenJiMiFan();
        huangMenJiMiFan.setHasPotato(true);
        huangMenJiMiFan.setHasVeg(true);
        System.out.println(huangMenJiMiFan.getDesc());
        System.out.println(huangMenJiMiFan.cost());
    }
}
