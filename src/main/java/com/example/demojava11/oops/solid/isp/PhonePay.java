package com.example.demojava11.oops.solid.isp;

public class PhonePay implements UPIPayments{
    @Override
    public void sendMoney() {

    }

    @Override
    public void getScratchCards() {

    }

    @Override
    public void creditAmountInAccount() {
//THis method is not applicable for Phonepay
//        We are forcing this method to implemt here
//        Violates interface segregation principle

    }
}
