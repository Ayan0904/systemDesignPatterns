package org.example.StateDeginPatternVendingMachine.FollowingISP;

public class Shelf {
    boolean isPresent;

    Item item;

    int code;

    Shelf(Item item, int code){
        this.item = item;
        isPresent = true;
        this.code = code;
    }

    public boolean isAvailable(){
        return this.isPresent;
    }

    public void setAvailable(boolean isPresent){
        this.isPresent = isPresent;
    }

    public int getCode(){
        return  this.code;
    }

    public Item getItem(){
        return this.item;
    }
}
