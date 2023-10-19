package com.xworkz.yono;

import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankExecutor {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.credit(500);
        myAccount.credit(500);
        myAccount.credit(500);
        System.out.println("available balance of myaccount: " +myAccount.getBalance());
        //type casting -up /polymorphism

        SavingsAccount friendsAccount= new SavingsAccount();
        //BankAccount benificiaryAccount=friendsAccount
        System.out.println("tranfering 300 to friends account");

        myAccount.transfer(300,friendsAccount);

        System.out.println("available balance on friends account: " +friendsAccount.getBalance());



        SavingsAccount dadAccount =new SavingsAccount();
        System.out.println("tranfering 100 to Dad account");
        myAccount.transfer(100,dadAccount);


        System.out.println("available balance on dad account: " +dadAccount.getBalance());


        SavingsAccount momsAccount=new SavingsAccount();
        System.out.println("tranfering 100 to Mom account");

        myAccount.transfer(100,momsAccount);

        System.out.println("available balance on mom's account: " +momsAccount.getBalance());

        SavingsAccount brotherAccount= new SavingsAccount();
        System.out.println("tranfering 100 to brother account");

        myAccount.transfer(100,brotherAccount);
        System.out.println("available balance on brothers account: " +brotherAccount.getBalance());


    }
}
