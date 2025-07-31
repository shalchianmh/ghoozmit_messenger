package edu.sharif.selab.services;

import edu.sharif.selab.models.SmsMessage;

public interface SmsMessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
}
