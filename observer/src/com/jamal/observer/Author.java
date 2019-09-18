package com.jamal.observer;

/**
 * 作者接口
 */
public interface Author {
    // 添加关注者
    void addReader(Reader reader);
    //　删除关注者
    void deleteReader(Reader reader);
    // 通知关注者
    void notifyReader();
    // 写文章
    void writeArticle(String article);
}
