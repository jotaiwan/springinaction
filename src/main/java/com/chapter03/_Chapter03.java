package com.chapter03;

import com.beans.menu.Lunch;
import com.beans.music.BlankDisc;
import com.chapter03.configuration.Chapter03Config;
import com.chapter03.configuration.DataSourceConfig;
import com.chapter03.configuration.ExpressiveConfig;
import com.interfaces.Dessert;
import com.interfaces.music.CompactDisc;
import com.interfaces.music.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by jotaiwan on 3/06/2017.
 */
public class _Chapter03 {
    private Dessert dessert;

    @Autowired
    MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        System.out.println("Chapter03 Starts ..........");

        ApplicationContext ctxExp = getExpressiveContext();

        BlankDisc blankDisc = (BlankDisc) ctxExp.getBean(BlankDisc.class);
        blankDisc.play();

        ApplicationContext ctxChapter03Config = getChapter03ConfigContext();

        // here is broken.. coz can't find the bean
        CompactDisc cd = ctxChapter03Config.getBean(CompactDisc.class);
        cd.play();

        Dessert dessert = ctxChapter03Config.getBean(Dessert.class);
        System.out.println("Dessert is " + dessert.displayName());

        System.out.println("End of Chapter03 ..........");
    }


    public static ApplicationContext getChapter03ConfigContext() {
        return new AnnotationConfigApplicationContext(Chapter03Config.class);
    }

    public static ApplicationContext getExpressiveContext() {
        return new AnnotationConfigApplicationContext(ExpressiveConfig.class);
    }

    public static ApplicationContext getMultiContext() {
        return new AnnotationConfigApplicationContext( Chapter03Config.class, DataSourceConfig.class );
    }

    @Autowired
    @Qualifier("iceCream")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
