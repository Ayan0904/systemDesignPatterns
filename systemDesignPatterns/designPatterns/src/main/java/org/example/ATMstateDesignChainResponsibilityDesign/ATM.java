package org.example.ATMstateDesignChainResponsibilityDesign;

import org.example.ATMstateDesignChainResponsibilityDesign.State.ATMIdleState;
import org.example.ATMstateDesignChainResponsibilityDesign.State.ATMState;

public class ATM {
    ATMState atmState;
    private int totalAmount;

    private int thousandNotes;
    private int fiveHundredNotes;
    private int hundredNotes;

    ATM(){
        this.atmState = new ATMIdleState(this);
        thousandNotes = 10;
        fiveHundredNotes = 10;
        hundredNotes = 10;
    }

    public void setAtmState(ATMState atmState) {
        System.out.println("ATM state changed from "+this.atmState.toString()+" to "+atmState.toString());
        this.atmState = atmState;
    }

    public ATMState getAtmState(){
        return this.atmState;
    }

    public void deductAmount(int amount){
        totalAmount-=amount;
    }
    public void deductThousandNotes(int notes){

        this.thousandNotes -= notes;
        System.out.println("Thousand Notes avalibale in ATm are "+ Integer.toString(this.thousandNotes));
    }
    public void deductFiveHundredNotes(int notes){
        this.fiveHundredNotes -= notes;
        System.out.println("Five Hundred NOtes avaliable in ATM are " + Integer.toString(this.fiveHundredNotes));
    }
    public void deductHundredNotes(int notes){
        this.hundredNotes -= notes;
        System.out.println("Hundred Notes available in ATM are " +Integer.toString(this.hundredNotes));
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public int getHundredNotes() {
        return hundredNotes;
    }

    public int getThousandNotes() {
        return thousandNotes;
    }
}
