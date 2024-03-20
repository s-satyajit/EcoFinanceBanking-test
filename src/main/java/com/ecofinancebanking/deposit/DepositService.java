package com.ecofinancebanking.deposit;

import com.ecofinancebanking.account.Account;
import com.ecofinancebanking.account.AccountService;

public class DepositService {

    private AccountService accountService;

    public DepositService(AccountService accountService) {
        this.accountService = accountService;
    }

    // Method to deposit money into an account
    public boolean depositAmount(String accountId, double amount) {
        Account account = accountService.getAccountDetails(accountId);
        if (account != null) {
            account.deposit(amount);
            accountService.updateAccountBalance(accountId, account.getBalance());
            return true;
        }
        return false;
    }
}