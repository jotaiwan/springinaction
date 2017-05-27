package com.chapter02;

import com.chapter01.Visitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jotaiwan on 27/05/2017.
 */
public class _chapter02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        SgtPeppers s = new SgtPeppers();
        s.play();


    }
}
