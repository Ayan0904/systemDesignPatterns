package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;
import org.example.ATMstateDesignChainResponsibilityDesign.Card;

public class HASCardATMState extends ATMState{
    ATM atm;

    HASCardATMState(ATM atm){
        this.atm = atm;
    }

    public void authenticatePin(int enteredPin, Card card){
        if(!card.checkPin(enteredPin)){
            System.out.println("Wrong Pin entered ");
            return;
        }
        System.out.println("Authentication successfull");
        this.atm.setAtmState(new SelectOperationATMState(this.atm));
    }

    public void returnCard(){
        System.out.println("Card Returned");
    }
    public void exit(){
        this.atm.setAtmState(new ATMIdleState(this.atm));
    }
}
