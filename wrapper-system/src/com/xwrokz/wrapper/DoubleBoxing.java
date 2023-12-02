package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class DoubleBoxing {
    public static void main(String[] args) {
        //AutoBoxing
        Double weight=35.50D,weight1=50.00,weight2=48.57;
        List list=new ArrayList<>();
        list.add(weight);
        list.add(weight1);
        list.add(weight2);
        for (Object ref:list
             ) {
            System.out.println(ref);

        }
    }
}
