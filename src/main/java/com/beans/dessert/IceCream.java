package com.beans.dessert;

import com.annotation.Cold;
import com.annotation.Creamy;
import com.interfaces.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 4/06/2017.
 */
@Component
@Cold
@Creamy
@Primary
public class IceCream implements Dessert {

    private String name;

    public String displayName() {
        System.out.println("This is " + getName());
        return getName();
    }

    public String getName() {
        return "Icecream";
    }

    public void setName(String name) {
        this.name = name;
    }
}
