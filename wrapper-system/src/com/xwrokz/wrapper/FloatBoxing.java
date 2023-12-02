package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class FloatBoxing {
    public static void main(String[] args) {
        float num = 10.50f;
        Float number=num;
        //FloatBoxing number1=number;
        List<Float> list=new ArrayList<>();
        list.add(number);
        System.out.println(list);
    }
}
