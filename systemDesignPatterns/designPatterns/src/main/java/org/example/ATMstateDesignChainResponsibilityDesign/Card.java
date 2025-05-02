package org.example.ATMstateDesignChainResponsibilityDesign;

public class Card {
    private int cvv;
    private int pin;

    BankAccount bankAccount;

    Card(int cvv, int pin, BankAccount bankAccount){
        this.cvv = cvv;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public boolean checkPin(int pin){
        if(this.pin==pin){
            return true;
        }
        else return false;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
