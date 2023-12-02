package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListExecutor {
    public static void main(String[] args) {
        //List collection=new ArrayList();
        List collection=new LinkedList();
        //Collection collection =new ArrayList();
        collection.add("Virat Kohli");
        collection.add("Sachin Tendulkar");
        collection.add("MS Dhoni");
        collection.add("KL Rahul");
        collection.add("Rohit Sharma");
        collection.add("Jadega");
        collection.add("Hardik Pandya");
        collection.add("Rahul Dravid");
        collection.add("Ms Dhoni");
        collection.add("Virat Kohli");//can store duplicate values,
        collection.add(null);// list can store multiple null values
        collection.add(2,"Smrithi ");//insert based  data based on index
        System.out.println(collection);

    }
}
