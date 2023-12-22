package com.lld.StructuralDesign.bridge.solution1;

public class BridgePattern {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(),new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Car(new Produce(),new Assemble());
        vehicle2.manufacture();
    }
}
