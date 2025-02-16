package com.example.demojava11.oops.designpatterns.abstractfactory;

// Its a concrete factory
public class MsiManifacturer extends CompanyFactory {
    @Override
    public GPU createGPU() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
