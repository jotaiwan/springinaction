package com.chapter02.xmlconfig;

import java.util.List;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class BlankDiscNew2 implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDiscNew2() {

    }

    public BlankDiscNew2(String title, String artist, List<String> tracks) {
        this.setTitle(title);
        this.setArtist(artist);
        this.setTracks(tracks);
    }

    public void play() {
        System.out.println("Play " + getTitle() + " by " + getArtist());
        for (String track : getTracks()) {
            System.out.println("-Track: " + track);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
