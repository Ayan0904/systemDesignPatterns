package org.example.StateDeginPatternVendingMachine.NotFollowingISP;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineRun {
    public static void main(String[] args) {
        List<Shelf> shelfList = new ArrayList<>();
        shelfList.add(new Shelf(new Item("Mango", 20), 101));
        shelfList.add(new Shelf(new Item("Coke", 40), 102));
        shelfList.add(new Shelf(new Item("Litchi", 100), 103));
        shelfList.add(new Shelf(new Item("Watermelon", 50), 104));
        shelfList.add(new Shelf(new Item("Fanta", 30), 105));
        shelfList.add(new Shelf(new Item("Juice", 20), 106));

        Inventory inventory = new Inventory(shelfList);

        VendingMachine vendingMachine = new VendingMachine(inventory);


        vendingMachine.getVendingMachineState().pressCashButton();
        vendingMachine.getVendingMachineState().insertMoney(100);
        vendingMachine.getVendingMachineState().insertMoney(50);
        System.out.println(vendingMachine.getMoneyDeposited());

        vendingMachine.getVendingMachineState().pressCancelButton();
        System.out.println(vendingMachine.getMoneyDeposited());



        vendingMachine.getVendingMachineState().pressCashButton();
        vendingMachine.getVendingMachineState().insertMoney(70);
        vendingMachine.getVendingMachineState().insertMoney(50);
        System.out.println(vendingMachine.getMoneyDeposited());
        vendingMachine.getVendingMachineState().pressProductSelectionButton();
        vendingMachine.getVendingMachineState().chooseProduct(103);
        System.out.println(vendingMachine.getMoneyDeposited());

        vendingMachine.getVendingMachineState().dispenseProduct();
        System.out.println(vendingMachine.getMoneyDeposited());


        vendingMachine.getVendingMachineState().pressCashButton();
        vendingMachine.getVendingMachineState().insertMoney(10);
        vendingMachine.getVendingMachineState().insertMoney(20);
        System.out.println(vendingMachine.getMoneyDeposited());
        vendingMachine.getVendingMachineState().pressProductSelectionButton();
        vendingMachine.getVendingMachineState().chooseProduct(103);
        System.out.println(vendingMachine.getMoneyDeposited());
        vendingMachine.getVendingMachineState().chooseProduct(102);
        System.out.println();
//        vendingMachine.getVendingMachineState().dispenseProduct();
//        System.out.println(vendingMachine.getMoneyDeposited());





    }
}
