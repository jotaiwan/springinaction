package com.practices;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jotaiwan on 20/05/2017.
 */
public class HelloWorld {

    GoodWorld goodWorld;

    private String helloMessage;

    private String goodMessage;

    public HelloWorld() {
        setGoodMessage(goodWorld.getGoodMessage());
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getGoodMessage() {
        return goodMessage;
    }

    public void setGoodMessage(String goodMessage) {
        this.goodMessage = goodMessage;
    }
}
