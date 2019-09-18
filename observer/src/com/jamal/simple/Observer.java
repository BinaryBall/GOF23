package com.jamal.simple;

/**
 * 观察者
 * 观察者必须有一个接收通知的方法
 */
public interface Observer {
    // 接收变化通知接口
    void update(String message);
}
