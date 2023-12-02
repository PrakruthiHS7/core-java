package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ShortBoxing {
    public static void main(String[] args) {
        //autoboxing
        //shortRange-32768 to 32767
    Short number1=500,number2=32767,number3=3276;
        List list=new ArrayList<>();
        list.add(number1);
        list.add(number2);
        list.add(number3);
        for (Object ref:list
             ) {
            System.out.println(ref);
        }
    }
}
