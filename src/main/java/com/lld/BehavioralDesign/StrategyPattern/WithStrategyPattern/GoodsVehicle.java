package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
