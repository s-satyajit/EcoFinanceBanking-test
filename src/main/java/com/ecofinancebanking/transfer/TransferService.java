package com.ecofinancebanking.transfer;

import com.ecofinancebanking.account.Account;
import com.ecofinancebanking.account.AccountService;

public class TransferService {

    private AccountService accountService;

    public TransferService(AccountService accountService) {
        if (accountService == null) {
            throw new IllegalArgumentException("AccountService cannot be null");
        }
        this.accountService = accountService;
    }

    public boolean transferAmount(String fromAccountId, String toAccountId, double amount) {
        if (fromAccountId == null || toAccountId == null) {
            throw new IllegalArgumentException("Account IDs cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        Account fromAccount = accountService.getAccountDetails(fromAccountId);
        Account toAccount = accountService.getAccountDetails(toAccountId);

        if (fromAccount == null || toAccount == null) {
            return false;
        }

        if (!fromAccount.withdraw(amount)) {
            return false;
        }

        toAccount.deposit(amount);
        accountService.updateAccountBalance(fromAccountId, fromAccount.getBalance());
        accountService.updateAccountBalance(toAccountId, toAccount.getBalance());
        return true;
    }
}