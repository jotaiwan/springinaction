package com.chapter01;

/**
 * Created by jotaiwan on 23/05/2017.
 */
public class Visitor {
    private String greeting;

    public void friends() {
        // have chatting..
       System.out.println(greeting);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
