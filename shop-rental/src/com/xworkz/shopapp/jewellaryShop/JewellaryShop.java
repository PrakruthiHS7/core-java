package com.xworkz.shopapp.jewellaryShop;

import com.xworkz.shopapp.fruits.Shop;
//implemented class
public abstract class JewellaryShop implements Shop {
    @Override
    public void doBusiness() {
        System.out.println("Business run by selling the jewellary");
    }
}
