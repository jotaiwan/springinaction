package com.chapter02.xmlconfig;

import com.chapter01.Visitor;
import com.chapter02.*;
import com.chapter02.autoconfig.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jotaiwan on 28/05/2017.
 */
public class _XmlConfig {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/xmlContext.xml");

        CompactDisc cd = (CompactDisc) context.getBean("compactDisc");

        CDPlayer player = new CDPlayer(cd);
        player.play();

        BlankDisc blank = (BlankDisc) context.getBean("blankDisc");
        blank.play();

        BlankDiscNew blankNew = (BlankDiscNew) context.getBean("blankDiscNew");
        blankNew.play();
    }
}
