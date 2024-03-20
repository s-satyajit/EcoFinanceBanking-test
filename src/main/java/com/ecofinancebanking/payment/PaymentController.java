package com.ecofinancebanking.payment;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam String paymentDetails) {
        boolean isProcessed = paymentService.processPayment(paymentDetails);
        return isProcessed ? "Payment processed successfully" : "Payment processing failed";
    }
}