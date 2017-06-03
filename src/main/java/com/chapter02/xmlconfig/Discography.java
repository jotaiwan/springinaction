package com.chapter02.xmlconfig;

import java.util.List;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class Discography {

    private String artist;
    private List<CompactDisc> discs;

    public Discography(String artist, List<CompactDisc> discs) {
        this.artist = artist;
        this.discs = discs;
    }

    public void play() {
        System.out.println("Play by " + artist);
        for (CompactDisc disc : discs) {
            disc.play();
        }
    }
}
