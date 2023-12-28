package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
