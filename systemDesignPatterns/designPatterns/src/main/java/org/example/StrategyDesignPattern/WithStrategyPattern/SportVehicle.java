package org.example.StrategyDesignPattern.WithStrategyPattern;

import org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy.DriveStrategyIntf;
import org.example.StrategyDesignPattern.WithStrategyPattern.Vehicle;

public class SportVehicle extends Vehicle {
    SportVehicle(DriveStrategyIntf driveStrategyIntf){
        super(driveStrategyIntf);
    }
}
