package com.chapter01;

/**
 * Created by jotaiwan on 23/05/2017.
 */
public class Visitor {
    private String partyTime;

    public void friendVisitors() {
        // having fun
       System.out.println(partyTime + " with friends");
    }

    public String getPartyTime() {
        return partyTime;
    }

    public void setPartyTime(String partyTime) {
        this.partyTime = partyTime;
    }

}
