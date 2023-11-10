package com.xworkz.playstore.exception;

public class AppTypeNotFoundException extends RuntimeException{
    public AppTypeNotFoundException(String errorMesaage){
        System.out.println(errorMesaage);
    }
}
