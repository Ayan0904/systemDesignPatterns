package org.example.StateDeginPatternVendingMachine.FollowingISP.State;

import org.example.StateDeginPatternVendingMachine.FollowingISP.VendingMachineState;

public interface HasMoneyVMState extends VendingMachineState {
    void insertMoney(int money);
    void pressProductSelectionButton();
    void pressCancelButton();
}
