package com.chapter03.configuration;

import com.beans.music.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by jotaiwan on 4/06/2017.
 */
@Configuration
@PropertySource("classpath:/properties/app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment environment;

    @Bean()
    public BlankDisc blanDisc() {
        String title = environment.getProperty("disc.title", "Default Title");
        String artist = environment.getProperty("disc.artist", "Default Artist");

        // extra property, doesn't related to create BlankDisc
        int count = environment.getProperty("db.connection.count", Integer.class, 20);

        try {
            environment.getRequiredProperty("required.property");
        } catch(IllegalStateException e) {
            System.out.println("hoops");
        }

        String[] profiles = environment.getActiveProfiles();

        return new BlankDisc(title, artist);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
