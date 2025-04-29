package org.example.ParkingLotLLD.ParkingSpot.Manager;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;
import org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy.ParkingStrategy;
import org.example.ParkingLotLLD.Vehicle;

import java.util.List;

public class ParkingSPOTManager {
    List<ParkingSPOT> parkingSPOTList;

    public ParkingSPOTManager(List<ParkingSPOT> parkingSPOTList){
        this.parkingSPOTList = parkingSPOTList;
    }

    void addParkingSPOT(ParkingSPOT p){
        this.parkingSPOTList.add(p);
    }

    void removeParkingSPOT(ParkingSPOT p){
        this.parkingSPOTList.remove(p);
    }

    public void parkVehicle(Vehicle v, ParkingSPOT p){
        p.parkVehicle(v);
    }

    public void removeVehicle(ParkingSPOT p){
        p.removeVehicle();
    }

    public ParkingSPOT findParkingSPOT(ParkingStrategy parkingStrategy){
        return parkingStrategy.findParkingSPOT(parkingSPOTList);
    }

}
