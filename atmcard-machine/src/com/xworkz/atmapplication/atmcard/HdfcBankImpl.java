package com.xworkz.atmapplication.atmcard;
//implemented class
public class HdfcBankImpl implements AtmCard{
    @Override
    public void insert() {
        System.out.println("HDFC ATM Card is inserting..");
    }

    @Override
    public void swipe() {
        System.out.println("HDFC ATM Card is swiping");

    }
}
