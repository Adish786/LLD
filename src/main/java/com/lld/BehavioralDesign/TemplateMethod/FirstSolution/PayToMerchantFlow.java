package com.lld.BehavioralDesign.TemplateMethod.FirstSolution;

public class PayToMerchantFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic Of PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount Logic Of PayToFriend");

    }
    @Override
    public void calculateFees() {
        System.out.println("2% fees charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
