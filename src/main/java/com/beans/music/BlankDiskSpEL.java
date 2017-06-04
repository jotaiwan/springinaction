package com.beans.music;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by jotaiwan on 4/06/2017.
 */
public class BlankDiskSpEL {
    private String title;
    private String artist;

    @Value("#{3.14159}")
    private float fnumber;

    public BlankDiskSpEL(
            @Value("#{systemProperties['disc.title']}") String title,
            @Value("#{systemProperties['disc.artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Play " + title + " by " + artist);
    }
}
