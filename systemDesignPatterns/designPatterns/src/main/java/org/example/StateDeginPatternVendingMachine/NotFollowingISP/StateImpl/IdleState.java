package org.example.StateDeginPatternVendingMachine.NotFollowingISP.StateImpl;

import org.example.StateDeginPatternVendingMachine.NotFollowingISP.VendingMachine;
import org.example.StateDeginPatternVendingMachine.NotFollowingISP.VendingMachineState;

public class IdleState implements VendingMachineState {
    VendingMachine vm;

    public IdleState(VendingMachine vm){
        this.vm = vm;
    }

    public void pressCashButton(){
        System.out.println("Pressing Cash Button You can insert Money now");
//        System.out.println("State changing from IDLE to HasMoney");
        this.vm.setVendingMachineState(new HasMoney(this.vm));
    }

    public void dispenseProduct(){
        System.out.println("Wrong State");
    }
    public void insertMoney(int money){
        System.out.println("Wrong State");}
    public void pressProductSelectionButton(){
        System.out.println("Wrong State");}
    public void chooseProduct(int code){
        System.out.println("Wrong State");}
    public void pressCancelButton(){
        System.out.println("Wrong State");}

}
