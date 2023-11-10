package com.xworkz.policeapp.Officer.exception;

public class OfficerAgeNotFoundException extends RuntimeException {
    public OfficerAgeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
