package com.epam.mjc;

public class IDNotFoundException extends IllegalArgumentException{
    public IDNotFoundException(String mess){
        super(mess);
    }
}
