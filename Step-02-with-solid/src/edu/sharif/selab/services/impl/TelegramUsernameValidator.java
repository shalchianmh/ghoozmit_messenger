package edu.sharif.selab.services.impl;

import edu.sharif.selab.services.ValidatorService;

public class TelegramUsernameValidator implements ValidatorService {
    public boolean validateServiceAddress(String username) {
        if (username == null || username.isEmpty()) {
            return false; // Username is not valid
        }

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false; // Username contains invalid characters
            }
        }

        return true;
    }
}
