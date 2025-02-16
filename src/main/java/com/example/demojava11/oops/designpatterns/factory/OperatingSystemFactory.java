package com.example.demojava11.oops.designpatterns.factory;

//Usecase??
// use it when u have no idea of exact types of objects
public class OperatingSystemFactory {

    public OS getOSInstance(String osType){
        switch (osType){
            case "ANDROID":
                return new Android();
            case "IOS":
                return new Ios();
            case "WINDOWS":
                return new Windows();
        }
        return new Android();
    }
}
