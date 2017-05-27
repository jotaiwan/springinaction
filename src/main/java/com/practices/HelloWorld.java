package com.practices;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jotaiwan on 20/05/2017.
 */
public class HelloWorld {

    @Autowired
    GoodWorld goodWorld;

    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getGoodMessage() {
        return goodWorld.getGoodMessage();
    }
}
