package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class IntegerBoxing {
    public static void main(String[] args) {
        //int num=25;
        // Autoboxing- covarsion of primitive type to Character object of Wrapper class.
      Integer number=25,number2=30,number3=40;

      List<Integer> list=new ArrayList<Integer>();
      list.add(number);
      list.add(number2);
      list.add(number3);

        for (Object ref:list) {
            System.out.println(ref);
        }



    }
}
