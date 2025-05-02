package org.example.ATMstateDesignChainResponsibilityDesign;

public class User {
    String name;
    BankAccount bankAccount;
    Card card;

    User(String name, BankAccount bankAccount, Card card){
        this.name = name;
        this.bankAccount = bankAccount;
        this.card = card;
    }
}
