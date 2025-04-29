package org.example.StrategyDesignPattern.WithStrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategyIntf{
    @Override
    public void drive() {
        System.out.println("Normal car driving");
    }
}
