package com.xworkz.dmart.exception;

public class ManufactureDateNotFoundException extends RuntimeException{
    public ManufactureDateNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
