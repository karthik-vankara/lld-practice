package com.example.demojava11.oops.designpatterns.strategy;

public class TestMain {
    public static void main(String[] args) {
//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
