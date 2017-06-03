package com.chapter02.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jotaiwan on 29/05/2017.
 */
public class _ComponentScan {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        BeanInterface bi = context.getBean(Bean1.class);
        bi.play();

        String a = "";
    }
}
