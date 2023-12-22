package com.lld.CreationalDesign.AbstractPattern2;

public abstract  class Car {
    CarType carType =null;
    Location location = null;

    Car(CarType carType,Location location){
        this.carType=carType;
        this.location=location;
    }

    abstract void construct();
    CarType getCarType(){
        return carType;
    }
    void setCarType(CarType carType){
        this.carType=carType;
    }
    Location getLocation(){
        return location;
    }
    void setLocation(Location location){
        this.location=location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
