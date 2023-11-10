package com.xworkz.exception;

public class TryMultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may cause exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Accessing an element that doesn't exist in the array
            System.out.println("Result: " + result); // This line won't be executed due to the exception
            System.out.println(7/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching specific exception for array index out of bounds
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catching specific exception for arithmetic errors
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            // Catching a more general exception for all other types of exceptions
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            // Code that will be executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }
}
