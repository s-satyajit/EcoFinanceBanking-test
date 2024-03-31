package com.ecofinancebanking.atm;

import com.ecofinancebanking.account.Account;
import com.ecofinancebanking.account.AccountService;

public class ATMService {

    private AccountService accountService;

    public ATMService(AccountService accountService) 
        this.accountService = accountService;
    }

    public boolean withdraw(String accountId, double amount) {
        Account account = accountService.getAccountDetails(accountId);
        if (account != null && account.withdraw(amount)) {
            accountService.updateAccountBalance(accountId, account.getBalance());
            return true;
        }
        return false;
    }

    public double checkBalance(String accountId) {
        Account account = accountService.getAccountDetails(accountId);
        return account != null ? account.getBalance() : 0;
    }
}
