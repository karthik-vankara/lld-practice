package com.example.demojava11.oops.designpatterns.strategy;

public class FlyNoway implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
