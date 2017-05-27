package com.chapter02.autoconfig;

import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@Component
public class SgtPeppers implements CompactDisc  {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artistt = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artistt);
    }
}
