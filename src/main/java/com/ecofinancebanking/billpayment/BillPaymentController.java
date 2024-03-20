package com.ecofinancebanking.billpayment;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;

@RestController
@RequestMapping("/billpayment")
public class BillPaymentController<BillPaymentService> {

    public interface BillPaymentService {
        boolean payBill(String accountId, double amount, String billerId);
    }

    private final BillPaymentService billPaymentService;

    public BillPaymentController(BillPaymentService billPaymentService) {
        this.billPaymentService = billPaymentService;
    }

    @PostMapping("/pay")
    public String payBill(@RequestParam String accountId,
                          @RequestParam double amount,
                          @RequestParam String billerId) {
        boolean success = billPaymentService.payBill(accountId, amount, billerId);
        return success ? "Bill payment successful" : "Bill payment failed";
    }
}