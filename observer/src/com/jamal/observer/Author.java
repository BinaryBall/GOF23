package com.jamal.observer;

/**
 * 作者接口
 */
public interface Author {

    void addReader(Reader reader);

    void deleteReader(Reader reader);

    void notifyReader();
}
