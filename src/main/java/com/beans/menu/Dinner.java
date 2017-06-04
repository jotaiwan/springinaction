package com.beans.menu;

import com.interfaces.Dessert;
import com.interfaces.FoodMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Created by jotaiwan on 4/06/2017.
 */
public class Dinner implements FoodMenu {

    Dessert dessert;

    public void menu() {
        System.out.println("Display Dinner Menu!");
    }

    public void order() {
        System.out.println("Order the menu now.");
        System.out.println("dessert will be " + dessert.displayName());
    }

    @Autowired
    @Qualifier("iceCream")
    public void setDessert(Dessert desscert) {
        this.dessert = desscert;
    }
}
