package com.xworkz.collection;
import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        System.out.println("HashSet order:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        System.out.println("LinkedHashSet order:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}

