package com.example.demojava11.oops.designpatterns.strategy;

public class Quack implements QuackBehavour{
    @Override
    public void quack() {
        System.out.println("I'm sounding as quack quack");
    }
}
