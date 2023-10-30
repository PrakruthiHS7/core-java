package com.xworkz.shopapp.bookShop;

import com.xworkz.shopapp.fruits.Shop;

//implemented class
public abstract class BookShop implements Shop {

    @Override
    public void doBusiness() {
        System.out.println("Running the business by sellig the books");
    }
}
