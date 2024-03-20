package com.ecofinancebanking.security;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/security")
public class SecurityController {

    private final SecurityService securityService;

    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @PostMapping("/authenticate")
    public String authenticateUser(@RequestParam String username, @RequestParam String password) {
        boolean isAuthenticated = securityService.authenticateUser(username, password);
        return isAuthenticated ? "User authenticated successfully" : "Authentication failed";
    }

    @PostMapping("/authorize")
    public String authorizeTransaction(@RequestParam String accountId, @RequestParam double amount) {
        boolean isAuthorized = securityService.authorizeTransaction(accountId, amount);
        return isAuthorized ? "Transaction authorized" : "Transaction not authorized";
    }
}