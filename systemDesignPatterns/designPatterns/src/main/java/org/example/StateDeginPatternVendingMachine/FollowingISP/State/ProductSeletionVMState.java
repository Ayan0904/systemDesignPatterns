package org.example.StateDeginPatternVendingMachine.FollowingISP.State;

import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public interface ProductSeletionVMState extends VendingMachineState {
    void chooseProduct(int code);
    void pressCancelButton();
}
