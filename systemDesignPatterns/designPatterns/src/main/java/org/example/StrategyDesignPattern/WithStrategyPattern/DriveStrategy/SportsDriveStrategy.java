package org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategyIntf{
    @Override
    public void drive() {
        System.out.println("sport car driving");
    }
}
