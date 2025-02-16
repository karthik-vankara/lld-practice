package com.example.demojava11.oops.designpatterns.abstractfactory;

public class AsusGpu implements GPU{
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
