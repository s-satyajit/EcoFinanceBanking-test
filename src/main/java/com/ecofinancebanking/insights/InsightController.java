package com.ecofinancebanking.insights;

import com.ecofinancebanking.account.GetMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/insights")
public class InsightController {

    private final InsightService insightService;

    public InsightController(InsightService insightService) {
        this.insightService = insightService;
    }

    @GetMapping("/generate")
    public List<String> generateAccountInsights(@RequestParam String accountId) {
        return insightService.generateAccountInsights(accountId);
    }
}