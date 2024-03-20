package com.ecofinancebanking.atm;

public class WithdrawService {

    public boolean withdrawAmount(String accountId, double amount) {
        // Check if the account exists
        if (accountExists(accountId)) {
            // Check if the account has sufficient balance
            if (hasSufficientBalance(accountId, amount)) {
            // Perform the withdrawal operation
            performWithdrawal(accountId, amount);
            return true;
            } else {
            System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Account not found");
        }
        return false;
    }

    private void performWithdrawal(String accountId, double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'performWithdrawal'");
    }

    private boolean hasSufficientBalance(String accountId, double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'hasSufficientBalance'");
    }

    private boolean accountExists(String accountId) {
        throw new UnsupportedOperationException("Unimplemented method 'accountExists'");
    }

}
