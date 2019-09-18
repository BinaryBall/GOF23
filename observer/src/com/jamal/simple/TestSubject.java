package com.jamal.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoxiang
 * @title: TestSubject
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1814:32
 */
public class TestSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String message = "";

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers)
            observer.update(message);
    }

    /**
     * 设置消息
     * @param message
     */
    public void setMessage(String message){
        this.message=message;
        notifyObservers();
    }
}
