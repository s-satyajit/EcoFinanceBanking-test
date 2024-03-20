package com.ecofinancebanking.alerts;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestBody;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;

@RestController
@RequestMapping("/alerts")
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @PostMapping("/create")
    public String createAlert(@RequestBody String message) {
        return alertService.createAlert(message);
    }
}