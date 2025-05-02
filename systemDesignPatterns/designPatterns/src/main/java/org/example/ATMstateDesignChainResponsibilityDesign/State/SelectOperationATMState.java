package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;
import org.example.ATMstateDesignChainResponsibilityDesign.Card;

public class SelectOperationATMState extends ATMState{
    ATM atm;

    SelectOperationATMState(ATM atm){
        this.atm = atm;
    }

    public void selectOperation(OperationType operationType, Card card){
        switch (operationType){
            case CHECKBALACE -> {
                this.atm.setAtmState(new CheckBalanceATMState(this.atm));
                break;
            }
            case CASHWITHDRAW -> {
                this.atm.setAtmState(new CashWithdrawATMState(this.atm));
                break;
            }
        }
    }

    public void returnCard(){
        System.out.println("Card Returned");
    }
    public void exit(){
        this.atm.setAtmState(new ATMIdleState(this.atm));
    }
}
