package com.jamal;

public class HuangMenJiMiFan {
    // 黄焖鸡价格
    private double huangMenJiPrice = 16D;
    // 土豆价格
    private double potatoPrice = 2D;
    // 鹌鹑蛋价格
    private double eggPrice = 2D;
    // 香菇价格
    private double mushroomPrice = 2D;
    // 青菜价格
    private double vegPrice = 1.5D;

    // 总价格
    private double totalPrice = 0D;


    // 订单描述
    private StringBuilder desc = new StringBuilder("黄焖鸡米饭 ");

    // 是否加土豆
    private boolean hasPotato = false;
    // 是否加鹌鹑蛋
    private boolean hasEgg = false;
    // 是否加香菇
    private boolean hasMushroom = false;
    // 是否加蔬菜
    private boolean hasVeg = false;

    public HuangMenJiMiFan(){
        this.totalPrice = this.huangMenJiPrice;
    }

    public void setHasPotato(boolean hasPotato) {
        this.hasPotato = hasPotato;
    }

    public void setHasEgg(boolean hasEgg) {
        this.hasEgg = hasEgg;
    }

    public void setHasMushroom(boolean hasMushroom) {
        this.hasMushroom = hasMushroom;
    }

    public void setHasVeg(boolean hasVeg) {
        this.hasVeg = hasVeg;
    }

    public String getDesc(){
        if (hasEgg){
            this.desc.append("+ 一份鹌鹑蛋 ");
        }
        if (hasMushroom){
            this.desc.append("+ 一份香菇 ");
        }
        if (hasPotato){
            this.desc.append("+ 一份土豆 ");
        }
        if (hasVeg){
            this.desc.append("+ 一份蔬菜 ");
        }
        return desc.toString();
    }

    public double cost(){
        if (hasEgg){
            this.totalPrice +=this.eggPrice;
        }
        if (hasMushroom){
            this.totalPrice +=this.mushroomPrice;
        }
        if (hasPotato){
            this.totalPrice +=this.potatoPrice;
        }
        if (hasVeg){
            this.totalPrice +=this.vegPrice;
        }
        return totalPrice;
    }
}
