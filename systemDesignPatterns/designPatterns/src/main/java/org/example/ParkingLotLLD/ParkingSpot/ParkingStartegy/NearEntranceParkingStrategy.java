package org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

import java.util.List;

public class NearEntranceParkingStrategy implements ParkingStrategy{

    @Override
    public ParkingSPOT findParkingSPOT(List<ParkingSPOT> parkingSPOTList) {
        for(var parkingSPOT: parkingSPOTList){
            if(parkingSPOT.isEmpty()){
                return parkingSPOT;
            }
        }
        return null;
    }
}
