package com.ecofinancebanking.alerts;

public class AlertService {

    public String createAlert(String message) {
        // For simplicity, let's assume that the message is valid
        if (message != null && !message.isEmpty()) {
            // Logic to create an alert
            return "Alert created with message: " + message;
        }
        return "Failed to create alert. Invalid message.";
    }
}