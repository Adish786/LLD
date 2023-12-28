package com.lld.BehavioralDesign.StrategyPattern.WithStrategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
