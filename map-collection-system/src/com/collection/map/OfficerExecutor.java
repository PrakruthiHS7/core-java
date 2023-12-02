package com.collection.map;

import com.collection.map.comparator.IdComparator;
import com.collection.map.comparator.NameComparator;
import com.collection.map.officer.Officer;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.*;

public class OfficerExecutor {
    public static void main(String[] args) {
        //Set<Map.Entry<Integer, Officer>> entries=map.entrySet();
        Map<Integer,Officer> map=new HashMap<>();
        map.put(1,new Officer(2,"Jai","PSI","Mandya"));
        map.put(2,new Officer(1,"Ram","SP","Bangalore"));
        map.put(3,new Officer(4,"Raj","IAS","Mysore"));
        map.put(4,new Officer(3,"John","DYSP","Yelahanka"));

        /*Set<Map.Entry<Integer,Officer>> entries= map.entrySet();
        //new key
        Iterator<Map.Entry<Integer,Officer>> iterator=entries.iterator();
        while (iterator.hasNext()){
            //next call once
           Map.Entry<Integer,Officer> entry =iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }*/
        //entry set-reteive
        //sorting the data using list,in map there is no sort method
        //looping ,forEach,iterator

         List<Map.Entry<Integer,Officer>> list=new ArrayList<Map.Entry<Integer,Officer>>(map.entrySet());
        Collections.sort(list,new NameComparator());
        //Collections.sort(list,new IdComparator());
        for (Map.Entry<Integer,Officer> entry: list
             ) {
            Integer key =entry.getKey();
            Officer val=entry.getValue();
            System.out.println("Key ="+key +", value = "+val);

        }
    }
}
