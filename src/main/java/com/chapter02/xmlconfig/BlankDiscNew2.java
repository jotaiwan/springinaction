package com.chapter02.xmlconfig;

import java.util.List;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class BlankDiscNew2 implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDiscNew2(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Play " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
