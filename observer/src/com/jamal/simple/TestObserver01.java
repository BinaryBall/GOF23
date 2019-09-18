package com.jamal.simple;

/**
 * @author xiaoxiang
 * @title: TestObserver01
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1814:38
 */
public class TestObserver01 implements Observer {
    public TestObserver01(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void update(String message) {
        System.out.println("TestObserver01接收到通知：" + message);
    }
}
