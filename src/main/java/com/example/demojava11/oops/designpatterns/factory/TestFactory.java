package com.example.demojava11.oops.designpatterns.factory;

public class TestFactory {
    public static void main(String[] args) {



//        Type of object is cleary exposed and client knows it
//        OS os = new Android();
//        OS os = new Ios();
//        OS os = new Windows();


//        Here I have created a OS factory where type of Object is hidden to the client
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getOSInstance("IOS");
//        OS os = operatingSystemFactory.getOSInstance("ANDROID");
//        OS os = operatingSystemFactory.getOSInstance("WINDOWS");
        os.getSpecification();
    }
}
