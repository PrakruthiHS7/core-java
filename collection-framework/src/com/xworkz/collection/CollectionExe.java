package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExe {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("momos");
        collection.add("samosa");
        collection.add("paniPuri");
        collection.add("machuri");
        //to print all data of collection by printing reference
        System.out.println(collection);
        System.out.println(collection.size());

        Collection collection1=new ArrayList();
        collection1.add("Veg Roll");
        collection1.add("Paneer Roll");
        collection1.add("Rajma Chawal");
        //to print all data of collection
        System.out.println(collection1);
        System.out.println(collection1.size());

        boolean yesOrNo=collection1.contains("momos");
        System.out.println(yesOrNo);
        boolean ref1=collection1.equals("Veg Roll");
        System.out.println(ref1);
        //bulk operation
        collection1.addAll(collection);
        System.out.println(collection1.size());
        //foreach-get the data one after the another
        //foreach-used tp process/read the data
        for (Object ref:collection) {
            System.out.println(ref.toString());
        }
        //java8
        //collection.forEach(System.out::println);






    }
}
