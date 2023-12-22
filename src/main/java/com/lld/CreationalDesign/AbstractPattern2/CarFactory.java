package com.lld.CreationalDesign.AbstractPattern2;

public class CarFactory {
    private CarFactory(){}

    public static Car buildCar(CarType carType){
        Car car = null;
        Location location=Location.INDIA;
        switch (location){
            case USA :
                car = USAFactory.buildCar(carType);
                break;
            case INDIA:
                car = USAFactory.buildCar(carType);
                break;
            default:
                car=DefaultCarFactory.buildCar(carType);

        }
        return car;
    }

}
