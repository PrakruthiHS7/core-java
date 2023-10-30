package com.xworkz.shopapp.groceryShop;

import com.xworkz.shopapp.fruits.Shop;

public abstract class GroceryShop implements Shop {
    @Override
    public void doBusiness() {
        System.out.println("Business is running by selling the Groceries");
    }
}
