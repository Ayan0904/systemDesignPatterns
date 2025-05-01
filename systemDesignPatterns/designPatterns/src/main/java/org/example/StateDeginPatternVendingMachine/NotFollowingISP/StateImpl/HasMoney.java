package org.example.StateDeginPatternVendingMachine.NotFollowingISP.StateImpl;

import org.example.StateDeginPatternVendingMachine.NotFollowingISP.VendingMachine;
import org.example.StateDeginPatternVendingMachine.NotFollowingISP.VendingMachineState;

public class HasMoney implements VendingMachineState {
    VendingMachine vm;

    public HasMoney(VendingMachine vm){
        this.vm = vm;
    }

    public void insertMoney(int money){
        System.out.println("Added money in vending machine"+Integer.toString(money));
        this.vm.addMoney(money);
    }

    public void pressCancelButton(){
        System.out.println("Cancel Button pressed money to be refunded "+Integer.toString(this.vm.getMoneyDeposited()));
        this.vm.addMoney(-1*this.vm.getMoneyDeposited());
        this.vm.setVendingMachineState(new IdleState(this.vm));
    }


    public void pressProductSelectionButton(){
//        System.out.println("product selection button pressed state change from HasMonay to ProductSelection");
        this.vm.setVendingMachineState(new ProductSelectionState(this.vm));
    }


    public void dispenseProduct(){
        System.out.println("Wrong state");
    }
    public void pressCashButton(){
        System.out.println("Wrong state");
    }
    public void chooseProduct(int code){
        System.out.println("Wrong state");
    }



}
