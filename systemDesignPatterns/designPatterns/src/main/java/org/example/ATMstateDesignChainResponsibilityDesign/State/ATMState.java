package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.Card;

public abstract class ATMState {
    public void insertCard(Card card){
        System.out.println("Invalid operation");
    }
    public void authenticatePin(int enteredPin, Card card){
        System.out.println("Invalid operation");
    }
    public void selectOperation(OperationType operationType, Card card){
        System.out.println("Invalid Operation");
    }
    public void cashWithdrawl(Card card, int amount){
        System.out.println("Invalid Operation");
    }

    public void checkBalance(Card card){
        System.out.println("Invalid Operation");
    }

    public void returnCard(){
        System.out.println("Invalid Operation");
    }
    public void exit(){
        System.out.println("Invalid Operation");
    }
}
