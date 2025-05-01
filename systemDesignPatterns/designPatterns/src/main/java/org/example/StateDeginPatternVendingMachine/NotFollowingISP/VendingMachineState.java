package org.example.StateDeginPatternVendingMachine.NotFollowingISP;

public interface VendingMachineState {
    void dispenseProduct();
    void insertMoney(int money);
    void pressProductSelectionButton();
    void pressCashButton();
    void chooseProduct(int code);
    void pressCancelButton();

}
