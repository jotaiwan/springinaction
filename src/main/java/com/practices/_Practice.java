package com.practices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jotaiwan on 20/05/2017.
 */
public class _Practice {
    public static void main(String[] args) {

        customerService();

//        helloWordAndGoodWorld();
    }

    private static void customerService() {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"/springCustomerContext.xml"});

        CustomerService cust = (CustomerService)context.getBean("customerService");

        System.out.println(cust);

        context.close();
    }

    private static void helloWordAndGoodWorld() {

        ApplicationContext context = new ClassPathXmlApplicationContext("/practiceContext.xml");

        BeanWorld bean = (BeanWorld) context.getBean("beanWorld");

        BeanDiffWorld beanDiff = (BeanDiffWorld) context.getBean("testBeanName");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");

        System.out.println(hello.getHelloMessage());

        System.out.println(hello.getGoodMessage());
    }
}
