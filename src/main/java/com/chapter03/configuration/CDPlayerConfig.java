package com.chapter03.configuration;

import com.chapter02.javaconfig.CDPlayer;
import com.chapter02.javaconfig.CompactDisc;
import com.chapter02.javaconfig.MediaPlayer;
import com.chapter02.javaconfig.SgtPeppers;
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

    @Bean
    public MediaPlayer mediaPlayer() {
        return new CDPlayer(sgtPeppers());
    }

}
