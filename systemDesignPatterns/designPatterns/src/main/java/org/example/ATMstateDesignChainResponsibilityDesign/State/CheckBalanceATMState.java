package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;
import org.example.ATMstateDesignChainResponsibilityDesign.Card;

public class CheckBalanceATMState extends ATMState{
    ATM atm;
    CheckBalanceATMState(ATM atm){
        this.atm = atm;
    }

    @Override
    public void checkBalance(Card card) {
        System.out.println("Balace is "+Integer.toString(card.getBankAccount().getBalance()));
        exit();
    }

    public void returnCard(){
        System.out.println("Card Returned");
    }
    public void exit(){
        this.atm.setAtmState(new ATMIdleState(this.atm));
    }

}
