package com.xwrokz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ByteBoxing {
    public static void main(String[] args) {
        //byte primitiveByte=8;
        Byte wrapperByte=8,wrapperByte1=9,wrapperByte2=127;
        List arraylist=new ArrayList<>();
        arraylist.add(wrapperByte);
        arraylist.add(wrapperByte1);
        arraylist.add(wrapperByte2);
        for (Object ref :arraylist
             ) {
            System.out.println(ref);
        }
    }
}
