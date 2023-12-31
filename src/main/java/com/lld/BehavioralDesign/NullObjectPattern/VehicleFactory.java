package com.lld.BehavioralDesign.NullObjectPattern;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfvehicle){
        if("Car".equals(typeOfvehicle)){
            return new Car();
        }
        return new NullVehicle();
    }
}
