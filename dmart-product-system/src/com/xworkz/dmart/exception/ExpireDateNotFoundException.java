package com.xworkz.dmart.exception;

public class ExpireDateNotFoundException extends RuntimeException{
    public ExpireDateNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
