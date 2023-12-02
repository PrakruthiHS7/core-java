package com.xworkz.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExecutor {
    public static void main(String[] args) {
        Queue collection =new PriorityQueue();
        collection.add("Virat Kohli");
        collection.add("Sachin Tendulkar");
        collection.add("MS Dhoni");
        collection.add("KL Rahul");
        collection.add("Rohit Sharma");
        collection.add("Jadega");
        collection.add("Hardik Pandya");
        collection.add("Rahul Dravid");
        collection.add("Virat Kohli");//queue can store duplicate values,
        //collection.add(null);// queue cannot store only one  null value
        // collection.add(2,"Smrithi ");//cannot add based on index.
        System.out.println(collection);
    }
}
