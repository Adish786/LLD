package com.lld.CreationalDesign.AbstractPattern2;

public class USAFactory {
    public static Car buildCar(CarType carType){
        Car car =null;
        switch (carType){
            case MICRO :
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car =new LuxuryCar(Location.USA);
                break;
            default:
                break;
        }
        return car;
    }
}
