package com.example.demojava11.oops.designpatterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoway();
        quackBehavour = new Sqeek();
    }

    public RubberDuck(FlyBehaviour flyBehaviour1,QuackBehavour quackBehavour1) {
        flyBehaviour = flyBehaviour1;
        quackBehavour = quackBehavour1;
    }


    @Override
    void display() {
        System.out.println("Display from rubber duck");
    }
}
