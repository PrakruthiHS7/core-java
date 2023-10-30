package com.xworkz.electricalapplication.switches;

public class TubelightImpl  implements Switch{
    @Override
    public void on() {
        System.out.println("Tublight is turn Onn...");
    }


    @Override
    public void off() {
        System.out.println("Tube light is turn Off..");

    }
}
