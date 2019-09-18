package com.jamal.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiaoxiang
 * @title: TestObserver01
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1815:34
 */
public class TestObserver03 implements Observer {

    public TestObserver03(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 如果参数为空，则主动拉取数据
        if (arg == null){
            if (o instanceof TestSubject){
                TestSubject testSubject = (TestSubject) o;
                System.out.println("JDK观察者3获取到新消息："+testSubject.getMessage());
            }
        }else{
            System.out.println(arg.toString());
        }
    }
}
