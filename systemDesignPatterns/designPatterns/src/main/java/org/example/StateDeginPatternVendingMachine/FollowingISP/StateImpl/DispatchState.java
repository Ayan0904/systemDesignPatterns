package org.example.StateDeginPatternVendingMachine.FollowingISP.StateImpl;

import org.example.StateDeginPatternVendingMachine.FollowingISP.State.DispatchVMState;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachine;
import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public class DispatchState implements DispatchVMState {
    VendingMachine vm;

    int productCode;

    public DispatchState(VendingMachine vm, int productCode){
        this.vm = vm;
        this.productCode = productCode;
    }

    public void dispenseProduct(){
        var shelf = this.vm.getInventory().getShelfWithCode(this.productCode);
        shelf.setAvailable(false);
        System.out.println("Item " + shelf.getItem().getName()+ " dispensed");
        this.vm.addMoney(-1*this.vm.getMoneyDeposited());
        this.vm.setVendingMachineState(new IdleState(this.vm));
    }


}
