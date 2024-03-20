package com.ecofinancebanking.moonlightbanking;

public class MoonlightBankingService {

    public String processTransaction(String transactionDetails) {
        // For simplicity, let's assume that the transaction details are valid
        if (transactionDetails != null && !transactionDetails.isEmpty()) {
            // Logic to process the transaction
            return "Transaction processed with details: " + transactionDetails;
        }
        return "Failed to process transaction. Invalid details.";
    }
}