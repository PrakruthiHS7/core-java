package com.xworkz.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("enter the age");
            int age = scanner.nextInt();
        }catch (InputMismatchException e) {
            // Handling InputMismatchException, which occurs when the entered value is not an integer
            System.out.println("Invalid input. Please enter a valid integer for age.");
            e.printStackTrace(); // Printing the stack trace for debugging purposes
        } catch (Exception e) {
            // Handling other exceptions that might occur
            e.printStackTrace(); // Printing the stack trace for debugging purposes
        } finally {
            // Closing the scanner to release resources
            scanner.close();
        }
    }
}