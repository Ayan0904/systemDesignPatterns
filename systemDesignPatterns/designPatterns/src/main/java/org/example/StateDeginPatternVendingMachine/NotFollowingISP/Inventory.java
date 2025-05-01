package org.example.StateDeginPatternVendingMachine.NotFollowingISP;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Shelf> shelfList;

    Inventory(List<Shelf> shelfList){
        this.shelfList = shelfList;
    }

    public void addShelf(Shelf shelf) {
        shelfList.add(shelf);
    }

    // Read - get all shelves
    public List<Shelf> getAllShelves() {
        return new ArrayList<>(shelfList); // return a copy to avoid external modification
    }

    public boolean removeShelf(Shelf shelf) {
        return shelfList.remove(shelf);
    }

    public Shelf getShelfWithCode(int code){
        for(var s: shelfList){
            if(s.getCode() == code){
                return s;
            }
        }
        return null;
    }

}
