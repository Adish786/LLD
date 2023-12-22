package com.lld.StructuralDesign.bridge.solution1;

public class Assemble implements WorkShop{
    @Override
    public void work() {
        System.out.print("And");
        System.out.println("Assembled");
    }
}
