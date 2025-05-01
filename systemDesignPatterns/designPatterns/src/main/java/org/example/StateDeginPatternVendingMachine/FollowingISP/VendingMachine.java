package org.example.StateDeginPatternVendingMachine.FollowingISP;

import org.example.StateDeginPatternVendingMachine.FollowingISP.State.DispatchVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.State.IdleVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.State.ProductSeletionVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.StateImpl.HasMoney;
import org.example.StateDeginPatternVendingMachine.FollowingISP.StateImpl.IdleState;

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

    public void pressCashButton(){
        if(this.vendingMachineState instanceof IdleVMState){
            ((IdleVMState)this.vendingMachineState).pressCashButton();
        }
        else{
            System.out.println("Wrong button pressed");
        }
    }

    public void insertMoney(int money){
        if(this.vendingMachineState instanceof HasMoney){
            ((HasMoney)this.vendingMachineState).insertMoney(money);
        }
        else{
            System.out.println("Wrong Button Pressed");
        }
    }

    public void pressCancelButton(){
        if(this.vendingMachineState instanceof HasMoney){
            ((HasMoney)this.vendingMachineState).pressCancelButton();
        }
        else if(this.vendingMachineState instanceof ProductSeletionVMState){
            ((ProductSeletionVMState)this.vendingMachineState).pressCancelButton();
        }
        else{
            System.out.println("Wrong button pressed");
        }
    }

    public void pressProductSelectionButton(){
        if(this.vendingMachineState instanceof HasMoney){
            ((HasMoney)this.vendingMachineState).pressProductSelectionButton();
        }
        else{
            System.out.println("Wrong button pressed");
        }
    }

    public void chooseProduct(int code){
        if(this.vendingMachineState instanceof ProductSeletionVMState){
            ((ProductSeletionVMState)this.vendingMachineState).chooseProduct(code);
        }
        else{
            System.out.println("Wrong button pressed");
        }
    }

    public void dispenseProduct(){
        if(this.vendingMachineState instanceof DispatchVMState){
            ((DispatchVMState)this.vendingMachineState).dispenseProduct();
        }
        else{
            System.out.println("Wrong button pressed");
        }
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
