package org.example.ParkingLotLLD;

import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;

public class Ticket {
    Vehicle v;
    ParkingSPOT p;
    long entryTime;

    public Ticket(Vehicle v, ParkingSPOT p){
        this.v = v;
        this.p = p;
        entryTime = System.nanoTime();
    }
}
