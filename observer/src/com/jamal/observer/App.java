package com.jamal.observer;


public class App {
    public static void main(String[] args) {
        PingtougeAuthor pingtougeAuthor = new PingtougeAuthor("平头哥");
        WangSanReader wangSanReader = new WangSanReader("王山");
        ZhangsanReader zhangsanReader = new ZhangsanReader("张三");
        LiSiReader liSiReader = new LiSiReader("李四");

        // 王山关注了平头哥的公众号
        pingtougeAuthor.addReader(wangSanReader);
        // 张三关注了平头哥的公众号
        pingtougeAuthor.addReader(zhangsanReader);
//
//        pingtougeAuthor.writeArticle("看完这篇你还不知道这些队列，我这些图白作了");

        // 李四关注了平头哥的技术博文
        pingtougeAuthor.addReader(liSiReader);

//        pingtougeAuthor.writeArticle("实现 Java 本地缓存，该从这几点开始");
        // 张三取关了平头哥的公众号
        pingtougeAuthor.deleteReader(zhangsanReader);
        pingtougeAuthor.writeArticle("观察者模式，从微信公众号群发说起");

    }
}
