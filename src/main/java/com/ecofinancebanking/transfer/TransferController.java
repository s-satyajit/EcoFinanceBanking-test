package com.ecofinancebanking.transfer;

public class TransferController {
    private TransferService transferService;

    public TransferController(TransferService transferService) {
        if (transferService == null) {
            throw new IllegalArgumentException("TransferService cannot be null");
        }
        this.transferService = transferService;
    }

    public boolean transferAmount(String fromAccountId, String toAccountId, double amount) {
        if (fromAccountId == null || toAccountId == null) {
            throw new IllegalArgumentException("Account IDs cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        return transferService.transferAmount(fromAccountId, toAccountId, amount);
    }
}
