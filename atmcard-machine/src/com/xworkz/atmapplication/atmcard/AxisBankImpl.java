package com.xworkz.atmapplication.atmcard;
//implemented class
public class AxisBankImpl implements AtmCard{
    @Override
    public void insert() {
        System.out.println("Axis Bank Atm Card is Inserting..");
    }

    @Override
    public void swipe() {
        System.out.println("Axis Bank Atm Card is Swiping..");

    }
}
