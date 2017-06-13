package com.beans.shopping;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jotaiwan on 4/06/2017.
 */
public class StoreService {

    private ShoppingCart shoppingCart;

    @Autowired
    public void setShooppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
