package com.xworkz.shopapp.cafe;

import com.xworkz.shopapp.fruits.Shop;

public abstract  class CafeShop implements Shop {
    @Override
    public void doBusiness()
    {
        System.out.println("Running the  business out of beverages");
    }
}
