package com.xworkz.shopapp;

import com.xworkz.shopapp.bookShop.BookShop;
import com.xworkz.shopapp.cafe.CafeShop;
import com.xworkz.shopapp.fruits.FruitsShop;
import com.xworkz.shopapp.fruits.Shop;
import com.xworkz.shopapp.groceryShop.GroceryShop;
import com.xworkz.shopapp.jewellaryShop.JewellaryShop;
import com.xworkz.shopapp.vegetableShop.VegetableShop;

public class ShopExecutor {
    public static void main(String[] args) {

        //abstraction- reference is interface type and object is class type
        Shop shop=new FruitsShop();
        shop.doBusiness();

        Shop shop1=new CafeShop();
        shop1.doBusiness();

        Shop shop2=new VegetableShop();
        shop2.doBusiness();

        Shop shop3=new BookShop();
        shop3.doBusiness();

        Shop shop4=new JewellaryShop();
        shop4.doBusiness();

        Shop shop5=new GroceryShop();
        shop5.doBusiness();
    }
}
