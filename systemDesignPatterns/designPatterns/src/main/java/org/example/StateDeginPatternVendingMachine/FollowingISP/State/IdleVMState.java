package org.example.StateDeginPatternVendingMachine.FollowingISP.State;

import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public interface IdleVMState extends VendingMachineState {
    void pressCashButton();
}

