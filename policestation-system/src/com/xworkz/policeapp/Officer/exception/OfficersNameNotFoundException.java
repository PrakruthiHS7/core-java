package com.xworkz.policeapp.Officer.exception;

public class OfficersNameNotFoundException extends RuntimeException{
    public OfficersNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
