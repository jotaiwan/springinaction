package com.chapter02.componentscan;

import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 29/05/2017.
 */
@Component("bean1")
public class Bean1 implements BeanInterface {
    public void play() {
        System.out.println("bean1");
    }
}
