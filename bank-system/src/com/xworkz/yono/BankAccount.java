package com.xworkz.yono;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

      public void debit(int amount)
   {
       if(balance>amount) {
           balance = balance - amount;
           System.out.println("Available balance on my account is " + balance);
       }
   }
   public void credit( int amount)
   {
       //System.out.println("credit amount" );
       this.balance=balance+amount;
   }
   public  void transfer(int amount ,BankAccount benificiaryAccount)
   {
      this.debit(amount);
      benificiaryAccount.credit(amount);
   }

}
