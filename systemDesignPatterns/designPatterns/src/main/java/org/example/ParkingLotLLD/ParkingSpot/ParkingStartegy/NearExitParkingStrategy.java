package org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

import java.util.List;

public class NearExitParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSPOT findParkingSPOT(List<ParkingSPOT> parkingSPOTList) {
        for(int i=parkingSPOTList.size()-1;i>=0;i--){
            if(parkingSPOTList.get(i).isEmpty()){
                return parkingSPOTList.get(i);
            }
        }
        return null;
    }
}
