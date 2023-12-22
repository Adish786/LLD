package com.lld.CreationalDesign.AbstractPattern2;

public class LuxuryCar extends  Car{
    LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
   protected void construct() {
        System.out.println("Connecting to Luxery car");
    }
}
