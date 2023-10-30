package com.xworkz.shopapp.vegetableShop;

import com.xworkz.shopapp.fruits.Shop;

//implemented class
public abstract class VegetableShop implements Shop {
    public void doBusiness()
    {
        System.out.println("These shops specialise in selling the broad range of fresh vegetables");
    }
}
