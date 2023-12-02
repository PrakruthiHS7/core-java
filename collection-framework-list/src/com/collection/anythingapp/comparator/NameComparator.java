package com.collection.anythingapp.comparator;

import com.collection.anythingapp.Anything.Anything;

import java.util.Comparator;

public class NameComparator implements Comparator<Anything> {
    @Override
    public int compare(Anything o1, Anything o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
