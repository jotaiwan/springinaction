package com.chapter02.xmlconfig;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Play " + title + " by " + artist);
    }
}
