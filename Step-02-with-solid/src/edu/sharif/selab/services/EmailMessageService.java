package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;

public interface EmailMessageService {
    public void sendEmailMessage(EmailMessage emailMessage);
}
