package com.example.demojava11.oops.designpatterns.factory;

public class Windows implements OS{

    @Override
    public void getSpecification() {
        System.out.println("I'm Windows");
    }
}
