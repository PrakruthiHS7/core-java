package com.xworkz.atmapplication.atmcard;
//implements-used to implement the interface
public class SbiBankImpl implements AtmCard {
    @Override
    public void insert() {
        System.out.println("SBI ATM Card is inserting...");
    }

    @Override
    public void swipe() {
        System.out.println("SBI ATM Card is swiping...");

    }
}
