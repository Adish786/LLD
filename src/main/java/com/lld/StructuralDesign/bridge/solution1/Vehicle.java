package com.lld.StructuralDesign.bridge.solution1;

public abstract class Vehicle {
    protected WorkShop workShop1;
    protected  WorkShop workShop2;
    protected Vehicle(WorkShop workShop1,WorkShop workShop2){
        this.workShop1=workShop1;
        this.workShop2=workShop2;

    }
    abstract public void manufacture();

}
