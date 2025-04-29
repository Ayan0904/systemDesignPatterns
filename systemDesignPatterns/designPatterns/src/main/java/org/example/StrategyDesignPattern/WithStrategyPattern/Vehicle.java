package org.example.StrategyDesignPattern.WithStrategyPattern;

import org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy.DriveStrategyIntf;

public class Vehicle {
    DriveStrategyIntf driveStrategyObj;

    Vehicle(DriveStrategyIntf driveStrategyObj){
        this.driveStrategyObj = driveStrategyObj;
    }

    void drive(){
        this.driveStrategyObj.drive();
    }
}
