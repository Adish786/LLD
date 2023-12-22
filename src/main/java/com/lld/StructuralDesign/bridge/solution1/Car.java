package com.lld.StructuralDesign.bridge.solution1;

//Refine Abstraction 2 in Bridge Pattern
public class Car extends Vehicle{

    public Car(WorkShop workShop1 , WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print("Car");
        workShop1.work();
        workShop2.work();

    }
}
