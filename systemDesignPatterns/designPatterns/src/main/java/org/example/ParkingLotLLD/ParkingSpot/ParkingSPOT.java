package org.example.ParkingLotLLD.ParkingSpot;

import org.example.ParkingLotLLD.Vehicle;

public class ParkingSPOT {
    int id;
    boolean empty;
    int price;
    Vehicle v;

    public ParkingSPOT(int id, int price){
        this.id = id;
        this.price = price;
        this.v = null;
        empty = true;
    }

    public void parkVehicle(Vehicle v){
        empty = false;
        this.v = v;
        System.out.println("Vehicle "+v.getName()+"parked");
    }

    public void removeVehicle(){
        empty = true;
        System.out.println("Vehicle "+v.getName()+" removed");
        v = null;
    }

    public int getPrice(){
        return this.price;
    }

    public boolean isEmpty(){
        return this.empty;
    }
}
