package org.example.ParkingLotLLD.ParkingSpot.Manager;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

import java.util.List;

public class FourWheelerParkingSPOTManager extends ParkingSPOTManager{
    List<ParkingSPOT> fourWheelerParkingSPOTList;
    public FourWheelerParkingSPOTManager(List<ParkingSPOT> parkingSPOTList){
        super(parkingSPOTList);
        this.fourWheelerParkingSPOTList = parkingSPOTList;
    }
}
