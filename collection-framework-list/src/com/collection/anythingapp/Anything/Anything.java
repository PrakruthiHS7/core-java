package com.collection.anythingapp.Anything;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
//Comparable is a interface
public class Anything implements  Comparable<Anything>{
    private int id;
    private  String name;
    private String location;
    private String warrenty;

    @Override
    public int compareTo(Anything o) //compare only one field
    {
        return  this.name.compareTo(o.name);
    }
//comparator is also an interface-java.util
}
