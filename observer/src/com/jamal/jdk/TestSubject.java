package com.jamal.jdk;

import java.util.Observable;

/**
 * @author xiaoxiang
 * @title: TestSubject
 * @projectName observer
 * @description: TODO
 * @date 2019/9/1815:30
 */
public class TestSubject extends Observable {

    private String message = "";

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObservers();
    }

    public String getMessage() {
        return message;
    }
}
