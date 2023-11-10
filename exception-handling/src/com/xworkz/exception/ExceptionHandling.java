package com.xworkz.exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int array[] = {10, 20, 30};
            // Code that may throw an exception
            System.out.println(array[10]); // This statement will throw ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            // Code to handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            // Code that is always executed
            System.out.println("finally block");
        }
    }
}
