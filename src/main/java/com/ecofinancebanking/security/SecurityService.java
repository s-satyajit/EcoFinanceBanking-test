package com.ecofinancebanking.security;

public class SecurityService {

    public boolean authenticateUser(String username, String password) {
        // For simplicity, let's assume there's a predefined username and password
        String predefinedUsername = "admin";
        String predefinedPassword = "password";

        // Check if the provided username and password match the predefined ones
        if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
            return true;
        }

        return false;
    }

    public boolean authorizeTransaction(String accountId, double amount) {
        // For simplicity, let's assume there's a predefined limit
        double limit = 1000.00;

        // Check if the amount is within the limit
        if (amount <= limit) {
            return true;
        }

        return false;
    }
}