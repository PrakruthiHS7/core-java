package com.xworkz.dmart.exception;

public class DateNotFoundException extends Throwable {
    public DateNotFoundException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
