package com.xworkz.atmapplication.atmcard;
//implemented class
public class CanaraBankImpl implements AtmCard{
    @Override
    public void insert() {
        System.out.println("Canara bank ATM card is Inserting.");
    }

    @Override
    public void swipe() {
        System.out.println("Canara Bank ATM card is Swiping..");

    }
}
