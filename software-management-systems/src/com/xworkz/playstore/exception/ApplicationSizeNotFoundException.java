package com.xworkz.playstore.exception;

public class ApplicationSizeNotFoundException extends RuntimeException{
    public ApplicationSizeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
