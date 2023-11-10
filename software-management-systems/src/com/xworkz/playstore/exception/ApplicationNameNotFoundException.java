package com.xworkz.playstore.exception;

public class ApplicationNameNotFoundException extends RuntimeException{
    public ApplicationNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }

}
