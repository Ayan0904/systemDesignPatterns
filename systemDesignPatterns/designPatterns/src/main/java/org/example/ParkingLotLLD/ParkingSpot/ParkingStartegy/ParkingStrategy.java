package org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

import java.util.List;

public interface ParkingStrategy {
    ParkingSPOT findParkingSPOT(List<ParkingSPOT> parkingSPOTList);
}
