package com.xworkz.shopapp.fruits;

//implementation class implements the functionality of interface(Shop)
public abstract class FruitsShop implements Shop {

    //concrete method- which has  implementation
    @Override
    //overide the abstract method
    public void doBusiness()
    {
        System.out.println("business will run by selling the fruits");
    }

}
