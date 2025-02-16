package com.example.demojava11.oops.designpatterns.abstractfactory;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
