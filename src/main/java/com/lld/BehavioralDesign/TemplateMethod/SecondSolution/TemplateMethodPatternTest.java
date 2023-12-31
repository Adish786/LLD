package com.lld.BehavioralDesign.TemplateMethod.SecondSolution;

public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        OrderProcessTemplate  netOrder = new NetOrder();
        netOrder.processOrder(true);
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
