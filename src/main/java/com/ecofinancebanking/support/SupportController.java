package com.ecofinancebanking.support;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/support")
public class SupportController {

    private final SupportService supportService;

    public SupportController(SupportService supportService) {
        this.supportService = supportService;
    }

    @PostMapping("/createTicket")
    public String createSupportTicket(@RequestParam String customerId, @RequestParam String query) {
        return supportService.createSupportTicket(customerId, query);
    }
}
