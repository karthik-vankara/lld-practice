package com.example.demojava11.oops.designpatterns.abstractfactory;


//usecase???
//When your code needs to work with various families of related products

// Abstract factory and it will be
// extended by Concrete factores like Asusmanifacturer, Msimanifactures etc
public abstract class CompanyFactory {
    public abstract GPU createGPU();
    public abstract Monitor createMonitor();
}
