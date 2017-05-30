package com.chapter02.mix;

import com.chapter02.componentscan.Bean1;
import com.practices.BeanWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jotaiwan on 30/05/2017.
 */
public class _Mix {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/mixContext.xml");

        // this ok: same package
        BlankDisc blank = (BlankDisc) ctx.getBean("blankDisc");
        blank.play();

        // java-based configuration: seems not working
        Bean1 bean1 = (Bean1) ctx.getBean("bean1");
        bean1.play();


        // xml inject is not working
        BeanWorld beanWorld = (BeanWorld) ctx.getBean("BeanWorld");
        beanWorld.say();
        String a = "";
    }
}
