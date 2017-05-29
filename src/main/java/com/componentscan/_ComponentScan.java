package com.componentscan;

import com.chapter02.javaconfig.CDPlayerConfig;
import com.chapter02.javaconfig.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

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
