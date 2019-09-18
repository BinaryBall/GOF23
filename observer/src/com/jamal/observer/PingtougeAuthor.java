package com.jamal.observer;

import java.util.Vector;

/**
 * @author 平头哥
 * @title: PingtougeAuthor
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1817:50
 */
public class PingtougeAuthor implements Author{

    // 关注者列表
    private Vector<Reader> readers ;
    // 作者名称
    private String name;
    // 文章
    private String article;


    public PingtougeAuthor(String name){
        this.name = name;
        this.readers = new Vector<>();
    }

    /**
     * 添加关注者
     * @param reader
     */
    @Override
    public void addReader(Reader reader) {
        if (readers.contains(reader)) return;
        readers.add(reader);
    }

    /**
     * 移除关注者
     * @param reader
     */
    @Override
    public void deleteReader(Reader reader) {
        readers.remove(reader);
    }

    /**
     * 通知关注者
     */
    @Override
    public void notifyReader() {
        for (Reader reader:readers){
            reader.reader(name,article);
        }
    }

    /**
     * 写文章
     * @param article
     */
    @Override
    public void writeArticle(String article){
        this.article = article;
        notifyReader();
    }
}
