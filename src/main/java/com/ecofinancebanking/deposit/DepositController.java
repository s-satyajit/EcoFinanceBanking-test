package com.ecofinancebanking.deposit;


import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    private final DepositService depositService;

    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @PostMapping("/add")
    public String depositAmount(@RequestParam String accountId,
                                @RequestParam double amount) {
        boolean success = depositService.depositAmount(accountId, amount);
        return success ? "Deposit successful" : "Deposit failed";
    }
}

