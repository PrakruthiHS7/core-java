package com.xworkz.object;
public class XworkzRunner {
    public static void main(String[] args) {
        Xworkz xworkz = new Xworkz();
        xworkz.name = "Students";
        xworkz.number = 2;

        Xworkz xworkz1 = new Xworkz();
        xworkz1.name = "Students";
        xworkz1.number = 2;
        Xworkz xworkz2=new Xworkz();
        // Call the custom toString method to get the custom string representation
        // String customStringRepresentation = xworkz.toString();
        //System.out.println(customStringRepresentation);
        //Object class is the parent class in Java. It contains the toString method. The toString method is used to return a string representation of an object. If any object is printed, the toString() method is internally invoked by the java compiler.
        System.out.println(xworkz);
        System.out.println(xworkz.equals(xworkz1));
        //fully qualified the name of the class
        System.out.println("name belogns to the class:"+xworkz.name.getClass());
        System.out.println( xworkz.number);
        System.out.println("hashcode:"+xworkz.hashCode());
        System.runFinalization();

    }
}

