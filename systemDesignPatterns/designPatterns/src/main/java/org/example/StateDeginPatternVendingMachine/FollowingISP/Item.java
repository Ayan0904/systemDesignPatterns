package org.example.StateDeginPatternVendingMachine.FollowingISP;

public class Item {
    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
