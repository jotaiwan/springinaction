package com.practices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jotaiwan on 20/05/2017.
 */
public class _Practice {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/practiceContext.xml");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");

//        GoodWorld good = (GoodWorld) context.getBean("goodWorld");

        System.out.println(hello.getHelloMessage());

        System.out.println(hello.getGoodMessage());

    }
}
