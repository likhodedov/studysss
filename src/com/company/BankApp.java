package com.company;

/**
 * Created by d.lihodedov on 21.07.2016.
 */
public class BankApp {
    public static void main(String[] args){
BankAccount card = new BankAccount(100.00);
        System.out.println("Стартовая величина счета");
        card.display();
        card.deposit(50);
        System.out.println("после депозита");
        card.display();
        card.withdraw(23.25235);
        System.out.println("после снятия средств");
        card.display();
    }
}
