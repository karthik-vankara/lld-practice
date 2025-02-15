package com.example.demojava11.oops.solid.dip.solution;

public class CreditCard implements BankCard {
    public void doTransaction(int amount){
        System.out.println("transaction from Credit card");
    }
}
