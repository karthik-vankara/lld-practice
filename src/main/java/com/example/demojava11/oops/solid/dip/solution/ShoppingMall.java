package com.example.demojava11.oops.solid.dip.solution;

public class ShoppingMall {

    private BankCard bankCard;


//    now we can accept both credit and debit cards
//    Run time polymorphysm
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchase(int amount){
        this.bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

//        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();

        //    now we can accept both credit and debit cards
        ShoppingMall shoppingMall = new ShoppingMall(creditCard);
        shoppingMall.purchase(100);
    }
}
