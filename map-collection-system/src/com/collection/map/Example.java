package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        //map is an interface use to store the key value pair
        Map<Integer,String> map=new HashMap<Integer,String>();

        map.put(1,"prakruthi");
        map.put(2,"Anitha");
        map.put(3,"Ashwini");
        map.put(4,"Prathiksha");
        map.remove(2,"Anitha");
        System.out.println( map.containsKey(3));
        //mapCheck is used check whether the particular value contains or not ,return type is boolean
        System.out.println(map);
        //map.get=used to get and print the particular value
        System.out.println("First value of the map is "+map.get(1));
        Set<Map.Entry<Integer,String> >entry=map.entrySet();
        for (Map.Entry<Integer,String> entries:entry){
            System.out.println(entries.getKey()+" = " + entries.getValue());}
        //keySet()-return set of keys
        //EntrySet-return  type of  entrySet is set of entries
        //Map.entry-interface of Map
        //Set<Map.Entry<Integer,Officer>> entries=map.entries
    }
}
