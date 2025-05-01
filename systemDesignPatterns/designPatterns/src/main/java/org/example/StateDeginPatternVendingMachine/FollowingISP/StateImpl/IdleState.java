package org.example.StateDeginPatternVendingMachine.FollowingISP.StateImpl;

import org.example.StateDeginPatternVendingMachine.FollowingISP.State.IdleVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachine;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public class IdleState implements IdleVMState {
    VendingMachine vm;

    public IdleState(VendingMachine vm){
        this.vm = vm;
    }

    public void pressCashButton(){
        System.out.println("Pressing Cash Button You can insert Money now");
//        System.out.println("State changing from IDLE to HasMoney");
        this.vm.setVendingMachineState(new HasMoney(this.vm));
    }

}
