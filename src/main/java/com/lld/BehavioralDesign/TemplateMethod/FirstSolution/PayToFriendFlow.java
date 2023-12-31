package com.lld.BehavioralDesign.TemplateMethod.FirstSolution;

public class PayToFriendFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic Of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Debit the Amount Logic Of PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("0% fees charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
