package com.xworkz.collection;

import java.util.*;
public class SetExecutor {
    public static void main(String[] args) {
        //Set collection=new HashSet();//HasSet store values in ordered manner
        //Set collection =new LinkedHashSet();
        //TreeSet store homogeneous type of data in orders manner
        Set collection=new TreeSet();
        collection.add("Virat Kohli");
        collection.add("Sachin Tendulkar");
        collection.add("MS Dhoni");
        collection.add("KL Rahul");
        collection.add("Rohit Sharma");
        collection.add("Jadega");
        collection.add("Hardik Pandya");
        collection.add("Rahul Dravid");
        collection.add("Ms Dhoni");
        collection.add("Virat Kohli");//cannot store duplicate value
        //collection.add(null);//Hash set stroe only one null values //treeset no null only homogeneos
        //store the date in unordered mannner
        System.out.println(collection.getClass());
        System.out.println(collection);
    }
}
