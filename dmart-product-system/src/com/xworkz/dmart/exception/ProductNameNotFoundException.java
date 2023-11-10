package com.xworkz.dmart.exception;

public class ProductNameNotFoundException extends Throwable {
    public ProductNameNotFoundException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
