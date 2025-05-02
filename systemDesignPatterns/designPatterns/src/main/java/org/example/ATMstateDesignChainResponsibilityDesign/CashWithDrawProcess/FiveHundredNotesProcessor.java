package org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;

public class FiveHundredNotesProcessor extends CashWithDrawProcessor{
    public FiveHundredNotesProcessor(CashWithDrawProcessor cashWithDrawProcessor){
        super(cashWithDrawProcessor);
    }

    public boolean withDraw(ATM atm, int amount){
        int fiveHundredNotesAvaliable = atm.getFiveHundredNotes();
        int notes = amount/500;
        int fiveHundredNotesReturn = 0;
        if(fiveHundredNotesAvaliable>=notes){
            fiveHundredNotesReturn = notes;
        }
        else{
            fiveHundredNotesReturn = fiveHundredNotesAvaliable;
        }
//        System.out.println("five Hundred notes to deduct "+Integer.toString(fiveHundredNotesReturn));
        if(next(atm, amount-500*fiveHundredNotesReturn)){
            atm.deductFiveHundredNotes(fiveHundredNotesReturn);
            System.out.println("FiveHundred notes are "+Integer.toString(fiveHundredNotesReturn));
            return true;
        }
        return false;
    }

}
