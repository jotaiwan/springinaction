package com.chapter02.javaconfig;

import com.chapter02.*;
import com.componentscan.ComponentScanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class _JavaConfig {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//
//        ctx.register(CDPlayerConfig.class);
//        ctx.refresh();
//
//        CompactDisc cd = ctx.getBean(CompactDisc.class);
//        cd.play();


        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();

        String a = "";

    }

}
