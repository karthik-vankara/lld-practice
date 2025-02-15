package com.example.demojava11.oops.solid.srp;

// Single responsiblity
// due to below conditions I have seperated service for Loanservice and NotificationService and
public class BankService {
    public long deposit(long amount, String accNo){
        return 0;
    }
    public long withdraw(long amount, String accNo){
        return 0;
    }
// moved to seperate services
////    In future if loan types are different like gold etc , so we need to changes this class manytimes.
////    Single responsibility fails
//    public void printLoanInterestInfo(String loanType){
//        if(loanType.equals("homeloan")){
////            do something
//        }
//        else if (loanType.equals("car")) {
////            car related
//        }
//        else if(loanType.equals("personal")){
////            personla
//        }
//    }
//
//
//    //    In future we can send otps thrugh whatsapp, messages etc , so we need to changes this class manytimes.
////    Single responsibility fails
//    public void sentOtp(String medium){
//        if(medium.equals("email")){
////            do someting
//        }
//    }
}
