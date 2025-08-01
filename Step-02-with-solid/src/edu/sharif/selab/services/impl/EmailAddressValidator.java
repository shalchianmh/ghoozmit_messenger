package edu.sharif.selab.services.impl;

import edu.sharif.selab.services.ValidatorService;

import java.util.regex.Pattern;

public class EmailAddressValidator implements ValidatorService {
    public boolean validateServiceAddress(String email) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }
}
