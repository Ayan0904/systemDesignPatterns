package org.example.ParkingLotLLD.ParkingSpot.Manager;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

import java.util.List;

public class TwoWheelerParkingSPOTManager extends  ParkingSPOTManager{
    List<ParkingSPOT> twoWheelerParkingSPOTList;
    public TwoWheelerParkingSPOTManager(List<ParkingSPOT> twoWheelerParkingSPOTList){
        super(twoWheelerParkingSPOTList);
        this.twoWheelerParkingSPOTList = twoWheelerParkingSPOTList;
    }
}
