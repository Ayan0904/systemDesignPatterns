package org.example.ATMstateDesignChainResponsibilityDesign.State;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;
import org.example.ATMstateDesignChainResponsibilityDesign.Card;
import org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess.CashWithDrawProcessor;
import org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess.FiveHundredNotesProcessor;
import org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess.HundredNotesProcessor;
import org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess.ThousandNotesProcessor;

public class CashWithdrawATMState extends ATMState{
    ATM atm;

    CashWithdrawATMState(ATM atm){
        this.atm = atm;
    }

    @Override
    public void cashWithdrawl(Card card, int amount) {
        if(amount>card.getBankAccount().getBalance()){
            System.out.println("Insufficient Balace");
            exit();
            return;
        }
        CashWithDrawProcessor cashWithDrawProcessor = new ThousandNotesProcessor(new FiveHundredNotesProcessor(new HundredNotesProcessor(null)));
        if(cashWithDrawProcessor.withDraw(this.atm, amount)){
            System.out.println("Amount withdrawn from atm "+Integer.toString(amount));
            this.atm.deductAmount(amount);
            card.getBankAccount().deductBalance(amount);
            System.out.println("Amount left in BankAccount " + Integer.toString(card.getBankAccount().getBalance()));
        }
        else{
            System.out.println("Could not withdraw "+Integer.toString(amount) + " from ATM");
        }
        exit();
    }

    public void returnCard(){
        System.out.println("Card Returned");
    }
    public void exit(){
        this.atm.setAtmState(new ATMIdleState(this.atm));
    }
}
