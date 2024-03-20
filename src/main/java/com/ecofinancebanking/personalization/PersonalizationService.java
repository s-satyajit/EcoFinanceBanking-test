package com.ecofinancebanking.personalization;

import java.util.Optional;

import org.jvnet.hk2.annotations.Service;

import com.ecofinancebanking.account.Account;

@Service
public class PersonalizationService {

    @Autowired
    private AccountRepository accountRepository;

    public String getPersonalizedDashboard(String accountId) {
        // Fetch the account based on the accountId
        @SuppressWarnings("unchecked")
        Optional<Account> optionalAccount = (Optional<Account>) accountRepository.findById(accountId);
        Account account = optionalAccount.orElseThrow(() -> new RuntimeException("Account not found"));

        // Personalize the dashboard based on the account type
        if (account.getType().equals("Savings")) {
            return "Welcome to your Savings Account dashboard!";
        } else if (account.getType().equals("Checking")) {
            return "Welcome to your Checking Account dashboard!";
        } else {
            return "Welcome to EcoFinance Banking!";
        }
    }
}