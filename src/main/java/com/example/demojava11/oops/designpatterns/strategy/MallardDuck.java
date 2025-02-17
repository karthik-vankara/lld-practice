package com.example.demojava11.oops.designpatterns.strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavour = new Quack();
        flyBehaviour = new FlyWIthWIngs();
    }

    @Override
    void display() {
        System.out.println("Display from mallar duck");
    }
}
