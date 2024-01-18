package com.lld.BehavioralDesign.TemplateMethod.FirstSolution;

public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriendFlow();
        paymentFlow.sendMoney();
        PaymentFlow paymentFlow1 = new PayToMerchantFlow();
        paymentFlow1.sendMoney();
    }
}
