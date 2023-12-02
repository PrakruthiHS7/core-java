package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class CharAutoBoxing {
    public static void main(String[] args) {
       // char ch = 'a';
        // Autoboxing- covarsion of primitive type to Character object
        Character a = 'a';
        //unboxing
        //char ch2=ch;unbox a char
        List arrayList =new ArrayList();


        arrayList.add(a);

        // printing the values from object
        System.out.println(arrayList);
    }
}