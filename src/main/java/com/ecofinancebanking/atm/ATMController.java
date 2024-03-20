package com.ecofinancebanking.atm;

import com.ecofinancebanking.deposit.DepositService;

public class ATMController {

    private DepositService depositService;
    private WithdrawService withdrawService;

    public ATMController(DepositService depositService, WithdrawService withdrawService) {
        this.depositService = depositService;
        this.withdrawService = withdrawService;
    }

    public boolean depositAmount(String accountId, double amount) {
        return depositService.depositAmount(accountId, amount);
    }

    public boolean withdrawAmount(String accountId, double amount) {
        return withdrawService.withdrawAmount(accountId, amount);
    }
}