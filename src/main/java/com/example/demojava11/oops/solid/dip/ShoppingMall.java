package com.example.demojava11.oops.solid.dip;

public class ShoppingMall {
    //        This should allow only shopping from Debit Card
//        To allow credit card shopping, I need to rewrite everything
    private DebitCard debitCard;

    //        This should allow only shopping from Debit Card
//        To allow credit card shopping, I need to rewrite everything
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void purchase(int amount){
        this.debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();

//        This should allow only shopping from Debit Card
//        To allow credit card shopping, I need to rewrite everything
        ShoppingMall shoppingMall = new ShoppingMall(debitCard1);
        shoppingMall.purchase(100);
    }
}
