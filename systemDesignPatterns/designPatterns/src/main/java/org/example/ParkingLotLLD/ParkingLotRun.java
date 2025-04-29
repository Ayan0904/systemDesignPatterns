package org.example.ParkingLotLLD;

import org.example.ParkingLotLLD.ParkingSpot.FourWheelerParkingSPOT;
import org.example.ParkingLotLLD.ParkingSpot.Manager.FourWheelerParkingSPOTManager;
import org.example.ParkingLotLLD.ParkingSpot.Manager.TwoWheelerParkingSPOTManager;
import org.example.ParkingLotLLD.ParkingSpot.ParkingSPOT;
import org.example.ParkingLotLLD.ParkingSpot.ParkingSpotManagerFactory;
import org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy.NearEntranceParkingStrategy;
import org.example.ParkingLotLLD.ParkingSpot.ParkingStartegy.NearExitParkingStrategy;
import org.example.ParkingLotLLD.ParkingSpot.TwoWheelerParkingSPOT;
import org.example.ParkingLotLLD.Payment.CardPayment;
import org.example.ParkingLotLLD.Payment.CashPayment;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRun {
    public static void main(String[] args) {
        List<ParkingSPOT> twoWheelerParkingSPOTList = new ArrayList<>();
        for(int i=0;i<100;i++){
            twoWheelerParkingSPOTList.add(new TwoWheelerParkingSPOT(i));
        }

        List<ParkingSPOT> fourWheelerParkingSPOTList = new ArrayList<>();
        for(int i=0;i<50;i++){
            fourWheelerParkingSPOTList.add(new FourWheelerParkingSPOT(i));
        }

        TwoWheelerParkingSPOTManager twoWheelerParkingSPOTManager = new TwoWheelerParkingSPOTManager(twoWheelerParkingSPOTList);

        FourWheelerParkingSPOTManager fourWheelerParkingSPOTManager = new FourWheelerParkingSPOTManager(fourWheelerParkingSPOTList);

        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory(twoWheelerParkingSPOTManager, fourWheelerParkingSPOTManager);

        EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);

        ExitGate exitGate = new ExitGate(parkingSpotManagerFactory);

        Vehicle bmw = new Vehicle("BMW", 1234, VehicleType.FOUR_WHEELER);
        Vehicle gtr = new Vehicle("GTR", 3456, VehicleType.FOUR_WHEELER);
        Vehicle mt15 = new Vehicle("mt15", 4567, VehicleType.TWO_WHEELER);

        var BMWParkingSPOT = entranceGate.findParkingSPOT(bmw, new NearEntranceParkingStrategy());
        entranceGate.bookParkingSPOT(bmw, BMWParkingSPOT);
        var BMWPARKINGTICKET = entranceGate.generateTicket(bmw, BMWParkingSPOT);


        var GTRParkingSPOT = entranceGate.findParkingSPOT(gtr, new NearExitParkingStrategy());
        entranceGate.bookParkingSPOT(gtr, GTRParkingSPOT);
        var GTRPARKINGTICKET = entranceGate.generateTicket(gtr, GTRParkingSPOT);

        var MT15ParkingSPOT = entranceGate.findParkingSPOT(mt15, new NearExitParkingStrategy());
        entranceGate.bookParkingSPOT(mt15, MT15ParkingSPOT);
        var MT15PARKINGTICKET = entranceGate.generateTicket(mt15, MT15ParkingSPOT);

        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        double amount = exitGate.calculateAmount(BMWPARKINGTICKET);
        exitGate.payment(new CashPayment(), amount);
        exitGate.UpdateParkingSpot(BMWPARKINGTICKET.v, BMWPARKINGTICKET.p);


        double amount1 = exitGate.calculateAmount(GTRPARKINGTICKET);
        exitGate.payment(new CashPayment(), amount1);
        exitGate.UpdateParkingSpot(GTRPARKINGTICKET.v, GTRPARKINGTICKET.p);

        double amount2 = exitGate.calculateAmount(MT15PARKINGTICKET);
        exitGate.payment(new CardPayment(), amount2);
        exitGate.UpdateParkingSpot(MT15PARKINGTICKET.v, MT15PARKINGTICKET.p);


    }
}
