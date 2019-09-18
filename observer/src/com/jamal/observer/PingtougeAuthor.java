package com.jamal.observer;

import java.util.Vector;

/**
 * @author xiaoxiang
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

    @Override
    public void addReader(Reader reader) {
        if (readers.contains(reader)) return;
        readers.add(reader);
    }

    @Override
    public void deleteReader(Reader reader) {
        readers.remove(reader);
    }

    @Override
    public void notifyReader() {
        for (Reader reader:readers){
            reader.reader(name,article);
        }
    }

    public void writeArticle(String article){
        this.article = article;
        notifyReader();
    }
}
