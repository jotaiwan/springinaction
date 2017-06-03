package com.chapter02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jotaiwan on 28/05/2017.
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new SgtPeppers();
//        } else if (choice == 1) {
//            return new WhiteAlbum();
//        } else if (choice == 2) {
//            return new HardDayNight();
//        } else {
//            return new Resolver();
//        }
//    }

    @Bean
    public MediaPlayer mediaPlayer() {
        return new CDPlayer(sgtPeppers());
    }

//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }
}
