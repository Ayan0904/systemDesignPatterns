package org.example.StateDeginPatternVendingMachine.NotFollowingISP;

import org.example.StateDeginPatternVendingMachine.NotFollowingISP.StateImpl.IdleState;

public class VendingMachine {

    VendingMachineState vendingMachineState;
    Inventory inventory;

    int moneyDeposited = 0;

    VendingMachine(Inventory inventory){
        this.vendingMachineState = new IdleState(this);
        this.inventory = inventory;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState){
        if(this.vendingMachineState!=null)
            System.out.println("Vending Machine state change from "+this.vendingMachineState.toString() + " to " + this.vendingMachineState.toString());
        this.vendingMachineState = vendingMachineState;
    }

    public VendingMachineState getVendingMachineState(){
        return this.vendingMachineState;
    }

    void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public void addMoney(int money){
        this.moneyDeposited+=money;
    }


    public int getMoneyDeposited(){
        return this.moneyDeposited;
    }

    public Inventory getInventory(){
        return this.inventory;
    }


}
