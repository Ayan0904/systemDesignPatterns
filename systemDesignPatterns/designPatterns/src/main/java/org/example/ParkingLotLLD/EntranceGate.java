package org.example.ParkingLotLLD;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;
import org.example.ParkingLotLLD.ParkingSpot.ParkingSpotManagerFactory;
import org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy.ParkingStrategy;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    ParkingSPOT findParkingSPOT(Vehicle v, ParkingStrategy parkingStrategy){
        return parkingSpotManagerFactory
                .getParkingSPOTManager(v.vehicleType)
                .findParkingSPOT(parkingStrategy);
    }

    void bookParkingSPOT(Vehicle v, ParkingSPOT ps){
        parkingSpotManagerFactory
                .getParkingSPOTManager(v.vehicleType)
                .parkVehicle(v, ps);
    }

    Ticket generateTicket(Vehicle v, ParkingSPOT p){
        return new Ticket(v, p);
    }

}
