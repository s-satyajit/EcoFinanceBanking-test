package com.ecofinancebanking.payment;

public class PaymentService {

    public boolean processPayment(String paymentDetails) {
        // For simplicity, let's assume that the payment details are valid
        if (paymentDetails != null && !paymentDetails.isEmpty()) {
            // Logic to process payment
            return true;
        }
        return false;
    }
}