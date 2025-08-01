package edu.sharif.selab.services.impl;

import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.services.MessageService;

public class SmsMessageServiceImpl implements MessageService<SmsMessage> {
    private final SmsPhoneNumberValidator phoneNumberValidator;

    public SmsMessageServiceImpl(SmsPhoneNumberValidator phoneNumberValidator) {
        this.phoneNumberValidator = phoneNumberValidator;
    }

    @Override
    public void sendMessage(SmsMessage smsMessage) {
        if (phoneNumberValidator.validateServiceAddress(smsMessage.getSource()) && phoneNumberValidator.validateServiceAddress(smsMessage.getTarget())) {
            System.out.println("Sending a SMS from " + smsMessage.getSource() + " to " + smsMessage.getTarget() + " with content : " + smsMessage.getContent());
        } else {
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }
}
