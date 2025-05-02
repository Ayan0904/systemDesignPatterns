package org.example.ATMstateDesignChainResponsibilityDesign.CashWithDrawProcess;

import org.example.ATMstateDesignChainResponsibilityDesign.ATM;

public abstract class CashWithDrawProcessor {
    CashWithDrawProcessor cashWithDrawProcessor;

    public CashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor){
        this.cashWithDrawProcessor = cashWithDrawProcessor;
    }
    public abstract boolean withDraw(ATM atm,int amount);

    boolean next(ATM atm, int amount){
        if(this.cashWithDrawProcessor==null){
            if(amount==0)return true;
            else return false;
        }
        return this.cashWithDrawProcessor.withDraw(atm, amount);
    }

}
