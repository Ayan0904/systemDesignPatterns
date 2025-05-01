package org.example.StateDeginPatternVendingMachine.FollowingISP.State;

import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public interface DispatchVMState extends VendingMachineState {
    void dispenseProduct();
}
