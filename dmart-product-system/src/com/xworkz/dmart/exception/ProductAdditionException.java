package com.xworkz.dmart.exception;

public class ProductAdditionException extends RuntimeException{
    public ProductAdditionException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
