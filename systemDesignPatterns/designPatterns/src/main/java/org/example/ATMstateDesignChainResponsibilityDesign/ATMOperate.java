package org.example.ATMstateDesignChainResponsibilityDesign;

import org.example.ATMstateDesignChainResponsibilityDesign.State.OperationType;

public class ATMOperate {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(25000);
        Card card = new Card(100,120560, bankAccount);
        User user = new User("SAM", bankAccount, card);
        ATM atm = new ATM();

        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(123456, card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CHECKBALACE, card);
        atm.getAtmState().checkBalance(card);

        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CASHWITHDRAW, card);
        atm.getAtmState().cashWithdrawl(card, 3700);

        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CASHWITHDRAW, card);
        atm.getAtmState().cashWithdrawl(card, 5700);

        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CASHWITHDRAW, card);
        atm.getAtmState().cashWithdrawl(card, 3200);


        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CASHWITHDRAW, card);
        atm.getAtmState().cashWithdrawl(card, 2300);

        atm.getAtmState().insertCard(card);
        atm.getAtmState().authenticatePin(120560, card);
        atm.getAtmState().selectOperation(OperationType.CASHWITHDRAW, card);
        atm.getAtmState().cashWithdrawl(card, 6000);


    }
}
