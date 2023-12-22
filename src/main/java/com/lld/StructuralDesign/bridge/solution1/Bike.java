package com.lld.StructuralDesign.bridge.solution1;

//Refine Abstraction 2 in Bridge Pattern
public class Bike extends Vehicle
{
    public Bike(WorkShop workShop1,WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print("Bike");
        workShop1.work();
        workShop2.work();
    }
}
