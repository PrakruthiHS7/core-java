package com.collection.anythingapp;

import com.collection.anythingapp.Anything.Anything;
import com.collection.anythingapp.comparator.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnythingExecutor {
    public static void main(String[] args) {
        List list =new ArrayList();

        list.add(new Anything(1,"lagguage bags","Bangalore","5Years"));
        list.add(new Anything(2,"Chair","Mumbai","3Years"));
        list.add(new Anything(3,"Bottles","Pune","2Years"));
        //Collections is a class used to  sorting the list values only
        //Collections.reverseOrder();//To print the values in reverse order
        //list
        Collections.sort(list);//used to sort the list ,Collections classes methods only applicable for list
        Collections.sort(list,new NameComparator());
        for(Object ref:list
        ) {
            System.out.println(ref);
        }

    }
}

