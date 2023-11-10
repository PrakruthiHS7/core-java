package com.xworkz.playstore.exception;
//custom unchecked exception
public class ApplicationNotFoundException extends RuntimeException{
    public ApplicationNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
