package com.chapter02.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@Component
public class CDPlayerWithProperty implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayerWithProperty(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
