package com.example.demojava11.oops.designpatterns.strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavour quackBehavour;

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehavour.quack();
    }

//    You can add one more behaviour like swim etc

    abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavour(QuackBehavour quackBehavour) {
        this.quackBehavour = quackBehavour;
    }
}
