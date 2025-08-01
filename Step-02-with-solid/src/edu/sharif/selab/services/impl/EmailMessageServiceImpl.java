package edu.sharif.selab.services.impl;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.services.MessageService;

public class EmailMessageServiceImpl implements MessageService<EmailMessage> {
    private final EmailAddressValidator emailAddressValidator;

    public EmailMessageServiceImpl(EmailAddressValidator emailAddressValidator) {
        this.emailAddressValidator = emailAddressValidator;
    }

    @Override
    public void sendMessage(EmailMessage emailMessage) {
        if (emailAddressValidator.validateServiceAddress(emailMessage.getSource()) && emailAddressValidator.validateServiceAddress(emailMessage.getTarget())) {
            System.out.println("Sending a SMS from " + emailMessage.getSource() + " to " + emailMessage.getTarget() + " with content : " + emailMessage.getContent());
        } else {
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }
}
