package com.xworkz.atmapplication.atmcard;
//implemented class
public class UnionBankImpl implements AtmCard{
    @Override
    public void insert() {
        System.out.println("Union Bank Atm card is inserting..");
    }

    @Override
    public void swipe() {
        System.out.println("Union bank  card is swiping");

    }
}
