package com.xworkz.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        //null pointer exception
        String s = null;
        String s1 = new String("null");
        /* exception handling */
        try {
            System.out.println(s.equals(s1));
        } catch (NullPointerException e) {
            System.out.println("Cannot Access Null value");
        }
        //arithmetic execption
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("check the denominator");
        }
        //ArrayIndexOutOfboundsException
        try {
            int[] array = new int[]{1, 2, 3, 4, 5,};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds ..check the index");
        }
        //input mismatched excetion
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the age ");
            int age = sc.nextInt();
            System.out.println("The Age is:" + age);
        } catch
        (InputMismatchException e) {
            System.out.println("input is mismatched");
        }
    }
}
