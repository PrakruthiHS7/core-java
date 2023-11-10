package com.xworkz.policeapp.Officer.exception;

public class InvalidPostNameException extends RuntimeException{
    public InvalidPostNameException(String errorMessage){
        System.out.println(errorMessage);
    }
}
