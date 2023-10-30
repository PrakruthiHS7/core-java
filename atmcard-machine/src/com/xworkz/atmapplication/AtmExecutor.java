package com.xworkz.atmapplication;

import com.xworkz.atmapplication.atmcard.*;

public class AtmExecutor {
    public static void main(String[] args) {
        AtmCard sbicard=new SbiBankImpl();
        sbicard.insert();
        sbicard.swipe();
        AtmCard card2=new CanaraBankImpl();
        card2.swipe();
        card2.insert();
        AtmCard card3=new UnionBankImpl();
        card3.insert();
        card3.swipe();
        AtmCard card4=new HdfcBankImpl();
        card4.insert();
        card4.swipe();
        AtmCard card5=new AxisBankImpl();
        card5.insert();
        card5.swipe();
    }
}
