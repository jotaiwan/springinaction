package com.beans.music;

import com.interfaces.music.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Petter's ALonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
