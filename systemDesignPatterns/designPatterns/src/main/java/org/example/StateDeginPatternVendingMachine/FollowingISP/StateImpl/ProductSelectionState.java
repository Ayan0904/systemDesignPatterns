package org.example.StateDeginPatternVendingMachine.FollowingISP.StateImpl;

import org.example.StateDeginPatternVendingMachine.FollowingISP.Inventory;
import org.example.StateDeginPatternVendingMachine.FollowingISP.State.ProductSeletionVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachine;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public class ProductSelectionState implements ProductSeletionVMState {
    VendingMachine vm;

    public ProductSelectionState(VendingMachine vm){
        this.vm = vm;
    }

    public void chooseProduct(int code){
        Inventory inventory = this.vm.getInventory();
        // 1. check whether item is present or not

        boolean flag = false;
        for(var shelf: inventory.getAllShelves()){
            if(shelf.getCode()==code && shelf.isAvailable()){
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Item with code "+Integer.toString(code) + " is not avalibalie");
            return;
        }

        int priceProduct = 0;
        for(var shelf: inventory.getAllShelves()){
            if(shelf.getCode()==code){
                priceProduct = shelf.getItem().getPrice();
                break;
            }
        }

        if(this.vm.getMoneyDeposited() >= priceProduct){
            System.out.println("Product choosen");

            if(this.vm.getMoneyDeposited() - priceProduct>0){
                this.initiateRefund(this.vm.getMoneyDeposited() - priceProduct);
                this.vm.addMoney(-1*(this.vm.getMoneyDeposited() - priceProduct));
            }
            this.vm.setVendingMachineState(new DispatchState(this.vm, code));
        }
        else{
            System.out.println("Insufficient funds ");
            initiateRefund(this.vm.getMoneyDeposited());
            this.vm.addMoney(-1*this.vm.getMoneyDeposited());
            this.vm.setVendingMachineState(new IdleState(this.vm));
        }

    }

    void initiateRefund(int amount){
        System.out.println("Refund Amount is "+Integer.toString(amount));
    }

    public void pressCancelButton(){
        System.out.println("Cancel Button pressed money to be refunded "+Integer.toString(this.vm.getMoneyDeposited()));
        this.vm.addMoney(-1*this.vm.getMoneyDeposited());
        this.vm.setVendingMachineState(new IdleState(this.vm));
    }

}
