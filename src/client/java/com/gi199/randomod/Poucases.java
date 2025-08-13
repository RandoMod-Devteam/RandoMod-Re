package com.gi199.randomod;

public class Poucases {
    public Poucases(RuntimeException exception){
        System.out.print("Exception:"+exception);
        throw exception;
        new Poucases(exception);
    }
}
