package org.example.StrategyDesignPattern.WithStrategyPattern;

import org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy.DriveStrategyIntf;
import org.example.StrategyDesignPattern.WithStrategyPattern.Vehicle;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(DriveStrategyIntf driveStrategyIntf){
        super(driveStrategyIntf);
    }
}
