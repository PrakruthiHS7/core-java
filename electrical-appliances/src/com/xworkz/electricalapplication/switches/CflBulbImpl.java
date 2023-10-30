package com.xworkz.electricalapplication.switches;

public class CflBulbImpl implements Switch{
    @Override
    public void on() {
        System.out.println("CflBulb is turn on..");
    }

    @Override
    public void off() {
        System.out.println("CflBulb is turn Off..");

    }
}
