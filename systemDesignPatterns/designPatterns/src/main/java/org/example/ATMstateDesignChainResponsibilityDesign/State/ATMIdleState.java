package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.Card;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;

public class ATMIdleState extends ATMState{
    ATM atm;

    public ATMIdleState(ATM atm){
        this.atm = atm;
    }

    public void insertCard(Card card){
        System.out.println("Card inserted");
        atm.setAtmState(new HASCardATMState(this.atm));
    }
}
