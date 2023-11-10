package com.xworkz.policeapp.Officer.exception;

public class OfficersAddressNotFounfException extends RuntimeException{
    public OfficersAddressNotFounfException(String errorMessage)
    {
        System.out.println(errorMessage);
    }
}
