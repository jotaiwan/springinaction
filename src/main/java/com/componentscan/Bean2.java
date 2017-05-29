package com.componentscan;

import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 29/05/2017.
 */
@Component("bean2")
public class Bean2 implements BeanInterface {
    public void play() {
        System.out.println("bean2");
    }
}
