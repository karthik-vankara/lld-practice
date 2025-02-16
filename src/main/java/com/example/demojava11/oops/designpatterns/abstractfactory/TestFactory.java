package com.example.demojava11.oops.designpatterns.abstractfactory;

public class TestFactory {
    public static void main(String[] args) {

//        MSI client specific
        CompanyFactory msiManifacturer = new MsiManifacturer();
        GPU msigpu = msiManifacturer.createGPU();
        Monitor msimonitor = msiManifacturer.createMonitor();
        msigpu.assemble();
        msimonitor.assemble();


//        Asus client specific
        CompanyFactory asusManifacturer = new AsusManifacturer();
        GPU asusgpu = asusManifacturer.createGPU();
        Monitor asusmonitor = asusManifacturer.createMonitor();

        asusgpu.assemble();
        asusmonitor.assemble();


    }
}
