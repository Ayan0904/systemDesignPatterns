package org.example.ParkingLotLLD;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;
import org.example.ParkingLotLLD.ParkingSpot.ParkingSpotManagerFactory;
import org.example.ParkingLotLLD.Payment.PaymentType;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    double calculateAmount(Ticket ticket){
        long exitTime = System.nanoTime();
        double totalAmount = ((exitTime - 0.0 - ticket.entryTime)/1e9) * ticket.p.getPrice();
        return totalAmount;
    }

    void payment(PaymentType paymentType, double amount){
        paymentType.pay(amount);
    }

    void UpdateParkingSpot(Vehicle v, ParkingSPOT parkingSPOT){
        parkingSpotManagerFactory.getParkingSPOTManager(v.vehicleType).removeVehicle(parkingSPOT);
    }
}
