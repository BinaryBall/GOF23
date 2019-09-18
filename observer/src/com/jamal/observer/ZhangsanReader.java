package com.jamal.observer;

/**
 * 读者账号
 */
public class ZhangsanReader implements Reader{
    private String name;

    public ZhangsanReader(String name){
        this.name = name;
    }

    @Override
    public void reader(String authorName,String article) {
        System.out.println(name+" 阅读了 "+authorName+" 发布的 "+article+" 文章");
    }


}
