package com.example.demojava11.oops.designpatterns.abstractfactory;

// Its a concrete factory
public class AsusManifacturer extends CompanyFactory{
    @Override
    public GPU createGPU() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
