package com.bridgelabz;

import java.util.Scanner;

//  Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber."
 //  Include a method to deposit money into the account and a method to withdraw money from the account.
public class BankAccount {
   private int balance;
   private String accountNumber;
   private String name;
    public final int MIN_BALANCE=500;

   public BankAccount(String name, int balance,String accountNumber)
   {
       this.name=name;
       this.balance=balance;
       this.accountNumber=accountNumber;
   }

   public void depositMoney(double amount, String enteredAccNum)
   {
      if( enteredAccNum.equals(accountNumber))
      {
          balance += amount;
          System.out.println("Money deposited! :" + amount);
          System.out.println("Current balance : " + balance);
      }
      else{
          System.out.println("Invalid account number");
      }
   }

     public void withdraw(double amount,String enteredAccNum)
     {
         if(enteredAccNum.equals(accountNumber) && balance >= MIN_BALANCE && amount <= balance)
         {
             balance -= amount;
             System.out.println("Withdrawn : " + amount);
             System.out.println("Current balance : " + balance);
         }
         else {
             System.out.println("Invalid account number, insufficient balance, or invalid withdrawal amount.");
         }
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter account holder name : ");
         String name=sc.next();

         System.out.println("Enter balance");
         int bal=sc.nextInt();

         System.out.println("Enter account number : ");
         String accountNumber= sc.next();

         BankAccount obj=new BankAccount(name,bal,accountNumber);

         System.out.println("Enter account number for transaction : ");
         String eneteredAccNum= sc.next();


         obj.depositMoney(500,eneteredAccNum);
         obj.withdraw(200,eneteredAccNum);

     }
}
