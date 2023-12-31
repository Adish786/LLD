package com.lld.BehavioralDesign.NullObjectPattern;

public class NullObjectClient {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicleObject("Bike");
        printvehicleDetails(vehicle);
    }

    private static void printvehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity : " +vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank  Capacity : " +vehicle.getTankCapacity());
    }
}
