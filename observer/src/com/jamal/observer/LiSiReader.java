package com.jamal.observer;

/**
 * 阅读者李四
 */
public class LiSiReader implements Reader{
    private String name;

    public LiSiReader(String name){
        this.name = name;
    }

    @Override
    public void reader(String authorName,String article) {
        System.out.println(name+" 阅读了 "+authorName+" 发布的 "+article+" 文章");
    }
}
