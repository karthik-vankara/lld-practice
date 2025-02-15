package com.example.demojava11.oops.interfaces;

// 100% abstraction class
// don't know the implementation logic but know business req
interface I{

    int i = 10; //  all data members are public static final

    void display(); // public abstract
}


public class InterfaceExample implements I {

    @Override
    public void display() {
        System.out.println("THis is method from interface I");
    }
    public static void main(String[] args) {
        I iRef = new InterfaceExample();
        iRef.display();
        System.out.println(iRef.i);
    }
}
