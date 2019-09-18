package com.jamal.simple;

/**
 * 主题
 * 主题必须包含三个方法 注册、删除、通知
 */
public interface Subject {
    // 注册观察者
    void registerObserver(Observer o);
    // 移除观察者
    void removeObserver(Observer o);
    // 通知观察者
    void notifyObservers();
}
