package com.chapter02.autoconfig;

import javax.inject.Named;


/**
 * Created by jotaiwan on 27/05/2017.
 */
@Named("SgtPeppersNamed")
public class SgtPeppersNamed {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band - Named";
    private String artistt = "The Beatles - Named";

    public void play2() {
        System.out.println("Playing " + title + " by " + artistt);
    }
}
