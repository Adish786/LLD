package com.lld.CreationalDesign.AbstractPattern2;

public class MiniCar extends  Car{

    MiniCar(Location location) {
        super(CarType.MINI, location);
    }


    @Override
   protected void construct() {
        System.out.println("Connecting MiniCar");
    }
}
