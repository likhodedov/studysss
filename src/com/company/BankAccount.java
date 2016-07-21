package com.company;

/**
 * Created by d.lihodedov on 21.07.2016.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double openingBalance){
        balance=openingBalance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw (double amount){
        balance=balance-amount;
            }
    public void display(){
        System.out.println("balance at your card="+balance);
    }
}
