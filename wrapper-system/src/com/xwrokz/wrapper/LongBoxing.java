package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class LongBoxing {
    public static void main(String[] args) {
        long phoneNumber= 1123345678L;
        Long number = phoneNumber;

        List<Long> list=new ArrayList<>();
        list.add(number);

        for (Object ref:list) {
            System.out.println(ref);
        }

    }
}
