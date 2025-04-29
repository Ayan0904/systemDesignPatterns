package org.example.ParkingLotLLD.ParkingSpot;

import org.example.ParkingLotLLD.ParkingSpot.Manager.FourWheelerParkingSPOTManager;
import org.example.ParkingLotLLD.ParkingSpot.Manager.ParkingSPOTManager;
import org.example.ParkingLotLLD.ParkingSpot.Manager.TwoWheelerParkingSPOTManager;
import org.example.ParkingLotLLD.VehicleType;

public class ParkingSpotManagerFactory {
    TwoWheelerParkingSPOTManager twoWheelerParkingSPOTManager;
    FourWheelerParkingSPOTManager fourWheelerParkingSPOTManager;

    public ParkingSpotManagerFactory(TwoWheelerParkingSPOTManager twoWheelerParkingSPOTManager, FourWheelerParkingSPOTManager fourWheelerParkingSPOTManager){
        this.twoWheelerParkingSPOTManager = twoWheelerParkingSPOTManager;
        this.fourWheelerParkingSPOTManager = fourWheelerParkingSPOTManager;
    }

    public ParkingSPOTManager getParkingSPOTManager(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER -> {
                return  twoWheelerParkingSPOTManager;
            }
            case FOUR_WHEELER -> {
                return fourWheelerParkingSPOTManager;
            }
            default -> {
                return null;
            }
        }
    }

}
