package org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;

public class ThousandNotesProcessor extends CashWithDrawProcessor{
    public ThousandNotesProcessor(CashWithDrawProcessor cashWithDrawProcessor){
        super(cashWithDrawProcessor);
    }
    public boolean withDraw(ATM atm, int amount){
        int thousandNotesAvaliable = atm.getThousandNotes();
        int notes = amount/1000;
        int thousandNotesReturn = 0;
        if(thousandNotesAvaliable>=notes){
            thousandNotesReturn = notes;
        }
        else{
            thousandNotesReturn = thousandNotesAvaliable;
        }
//        System.out.println("Thousand noted to deduct "+Integer.toString(thousandNotesReturn));
        if(next(atm, amount-1000*thousandNotesReturn)){
            atm.deductThousandNotes(thousandNotesReturn);
            System.out.println("Thousand notes are "+Integer.toString(thousandNotesReturn));
            return true;
        }
        return false;
    }
}
