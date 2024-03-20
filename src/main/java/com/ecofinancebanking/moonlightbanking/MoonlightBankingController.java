package com.ecofinancebanking.moonlightbanking;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/moonlightbanking")
public class MoonlightBankingController {

    private final MoonlightBankingService moonlightBankingService;

    public MoonlightBankingController(MoonlightBankingService moonlightBankingService) {
        this.moonlightBankingService = moonlightBankingService;
    }

    @PostMapping("/processTransaction")
    public String processTransaction(@RequestParam String transactionDetails) {
        return moonlightBankingService.processTransaction(transactionDetails);
    }
}