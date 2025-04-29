package org.example.StrategyDesignPattern.WithStrategyPattern;

import org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy.NormalDriveStrategy;
import org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy.SportsDriveStrategy;

public class Run {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportVehicle(new SportsDriveStrategy());
        vehicle1.drive();

        Vehicle vehicle2 = new PassengerVehicle(new NormalDriveStrategy());
        vehicle2.drive();

    }
}
