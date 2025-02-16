package com.example.demojava11.oops.designpatterns.abstractfactory;

public class MsiGpu implements GPU{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
