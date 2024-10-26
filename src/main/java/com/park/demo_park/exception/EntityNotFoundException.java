package com.park.demo_park.exception;

public class EntityNotFoundException  extends RuntimeException{
    public EntityNotFoundException(String message){
        super(message);
    }
}
