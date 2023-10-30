package com.xworkz.shopapp.bookShop;

public abstract class Book extends BookShop {
    @Override
    public void donate()
    {
        System.out.println("Donating a book");
    }
}
