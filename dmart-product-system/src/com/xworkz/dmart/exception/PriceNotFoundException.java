package com.xworkz.dmart.exception;

public class PriceNotFoundException extends Throwable {
    public PriceNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
