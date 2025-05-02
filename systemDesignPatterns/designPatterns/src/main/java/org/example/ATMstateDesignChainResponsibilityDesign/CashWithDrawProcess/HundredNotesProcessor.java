package org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;

public class HundredNotesProcessor extends CashWithDrawProcessor{

    public HundredNotesProcessor(CashWithDrawProcessor cashWithDrawProcessor){
        super(cashWithDrawProcessor);
    }

    public boolean withDraw(ATM atm, int amount){
        int huundredNotesAvaliable = atm.getHundredNotes();
        int notes = amount/100;
        int hundredNotesReturn = 0;
        if(huundredNotesAvaliable>=notes){
            hundredNotesReturn = notes;
        }
        else{
            hundredNotesReturn = huundredNotesAvaliable;
        }
//        System.out.println("Hundred notes to dedcut " + Integer.toString(hundredNotesReturn));
        if(next(atm, amount-100*hundredNotesReturn)){
            atm.deductHundredNotes(hundredNotesReturn);
            System.out.println("Hundred notes are "+Integer.toString(hundredNotesReturn));
            return true;
        }
        return false;
    }
}
