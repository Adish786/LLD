package com.lld.CreationalDesign.AbstractPattern2;

public class MicroCar extends  Car{

MicroCar(Location location){
    super(CarType.MICRO,location);
    construct();
}
    @Override
    void construct() {
        System.out.println("Connection MicroCar ");
    }
}
