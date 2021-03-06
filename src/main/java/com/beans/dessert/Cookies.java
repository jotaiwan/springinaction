package com.beans.dessert;

import com.interfaces.Dessert;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 4/06/2017.
 */
@Component
public class Cookies implements Dessert {
    private String name;

    public String displayName() {
        System.out.println("This is " + name);
        return name;
    }

    public String getName() {
        return "cookies";
    }

    public void setName(String name) {
        this.name = name;
    }
}
