package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class Vehicle {
    DriveStrategy  driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
