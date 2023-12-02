package com.collection.map.comparator;

import com.collection.map.officer.Officer;

import java.util.Comparator;
import java.util.Map;

public class NameComparator implements Comparator<Map.Entry<Integer,Officer>> {
    @Override
    public int compare(Map.Entry<Integer,Officer> o1, Map.Entry<Integer, Officer> o2)
        {

            return o1.getValue().getName().compareTo(o2.getValue().getName());
    }

}
