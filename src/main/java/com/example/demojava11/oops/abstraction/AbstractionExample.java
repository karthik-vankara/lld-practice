package com.example.demojava11.oops.abstraction;


// we can have abstract methods and non abstract methods also
// data varaible are not final by default, we can use own own access modifiers
// if we know few logic
abstract class AbstractClass{

    protected int i=0;
    static final int f=10;

    abstract void show();

    void display(){
        System.out.println("not abstract method display");
    }

}


public class AbstractionExample extends AbstractClass {
    @Override
    void show() {
        System.out.println("this is show of abstract class");
    }

    public static void main(String[] args) {
        AbstractClass A = new AbstractionExample();
        A.display();
        A.show();
        System.out.println(A.i);
        A.i = 100;
        System.out.println(A.i);
        System.out.println(AbstractClass.f);

    }
}
