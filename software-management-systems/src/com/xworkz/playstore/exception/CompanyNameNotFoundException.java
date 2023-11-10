package com.xworkz.playstore.exception;
//custom checked exception
public class CompanyNameNotFoundException extends Exception {
    public CompanyNameNotFoundException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
