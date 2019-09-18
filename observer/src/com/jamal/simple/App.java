package com.jamal.simple;

/**
 * @author xiaoxiang
 * @title: App
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1814:40
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        TestSubject subject = new TestSubject();
        TestObserver01 testObserver01 = new TestObserver01(subject);
        TestObserver02 testObserver02 = new TestObserver02(subject);
        TestObserver03 testObserver03 = new TestObserver03(subject);
        subject.setMessage("这是第一条消息");
        Thread.sleep(5000);
        subject.setMessage("这是第二条消息");
        Thread.sleep(5000);
        subject.setMessage("这是第三条消息");
    }
}
