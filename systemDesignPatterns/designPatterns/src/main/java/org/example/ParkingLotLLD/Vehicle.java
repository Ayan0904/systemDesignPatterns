package org.example.ParkingLotLLD;

public class Vehicle {
    String name;
    int id;
    VehicleType vehicleType;

    public Vehicle(String name, int id, VehicleType vehicleType){
        this.name = name;
        this.vehicleType = vehicleType;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
}
