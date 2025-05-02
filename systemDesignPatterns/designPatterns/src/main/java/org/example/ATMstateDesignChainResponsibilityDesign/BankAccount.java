package org.example.ATMstateDesignChainResponsibilityDesign;

public class BankAccount {
    private int balance;
    public void deductBalance(int amount){
        this.balance -= amount;
    }
    public int getBalance(){
        return this.balance;
    }
    BankAccount(int balance){
        this.balance = balance;
    }
}
