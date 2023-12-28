package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
