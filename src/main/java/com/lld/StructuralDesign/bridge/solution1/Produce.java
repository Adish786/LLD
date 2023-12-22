package com.lld.StructuralDesign.bridge.solution1;

public class Produce implements WorkShop{

    @Override
    public void work() {
        System.out.print("Produced");
    }
}
