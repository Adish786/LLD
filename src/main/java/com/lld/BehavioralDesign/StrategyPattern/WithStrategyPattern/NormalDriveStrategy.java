package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }

}
