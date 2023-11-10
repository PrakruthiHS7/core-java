package com.xworkz.policeapp.Officer.exception;

public class OfficerNotFoundException extends RuntimeException{
    public OfficerNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
