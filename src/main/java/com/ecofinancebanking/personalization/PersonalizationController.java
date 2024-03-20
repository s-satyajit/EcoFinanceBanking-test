package com.ecofinancebanking.personalization;

import com.ecofinancebanking.account.GetMapping;
import com.ecofinancebanking.account.PathVariable;
import com.ecofinancebanking.account.RestController;

@RestController
public class PersonalizationController {

    @Autowired
    private PersonalizationService personalizationService;

    @GetMapping("/dashboard/{accountId}")
    public String getPersonalizedDashboard(@PathVariable String accountId) {
        return personalizationService.getPersonalizedDashboard(accountId);
    }
}