package com.example.demojava11.oops.designpatterns.strategy;

public class Sqeek implements QuackBehavour {
    @Override
    public void quack() {
        System.out.println("I'm sounding like sqeek");
    }
}
