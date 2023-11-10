package com.xworkz.dmart.exception;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
