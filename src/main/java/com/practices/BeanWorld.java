package com.practices;

import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 29/05/2017.
 */
@Component
public class BeanWorld {
    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
