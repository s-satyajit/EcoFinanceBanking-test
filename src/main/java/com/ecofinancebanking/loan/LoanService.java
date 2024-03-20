package com.ecofinancebanking.loan;

import com.ecofinancebanking.account.Account;
import com.ecofinancebanking.account.AccountService;

public class LoanService {

    private AccountService accountService;

    public LoanService(AccountService accountService) {
        this.accountService = accountService;
    }

    public boolean applyForLoan(String accountId, double amount) {
        // For simplicity, let's assume there's a predefined limit
        double limit = 10000.00;

        // Check if the amount is within the limit
        if (amount <= limit) {
            // Logic to apply for a loan
            return true;
        }

        return false;
    }

    public boolean processLoanPayment(String accountId, double amount) {
        Account account = accountService.getAccountDetails(accountId);
        if (account != null) {
            // Deduct the loan payment from the account balance
            double newBalance = account.getBalance() - amount;
            if (newBalance >= 0) {
                account.setBalance(newBalance);
                accountService.updateAccountBalance(accountId, newBalance);
                return true;
            }
        }
        return false;
    }
}