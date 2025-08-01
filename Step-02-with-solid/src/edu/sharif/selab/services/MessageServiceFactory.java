package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.impl.*;

public class MessageServiceFactory {
    public static MessageService<? extends Message> getService(Message message) {
        EmailAddressValidator emailAddressValidator = new EmailAddressValidator();
        SmsPhoneNumberValidator smsPhoneNumberValidator = new SmsPhoneNumberValidator();
        TelegramUsernameValidator telegramUsernameValidator = new TelegramUsernameValidator();

        if (message instanceof SmsMessage) return new SmsMessageServiceImpl(smsPhoneNumberValidator);
        if (message instanceof EmailMessage) return new EmailMessageServiceImpl(emailAddressValidator);
        if (message instanceof TelegramMessage) return new TelegramMessageServiceImpl(telegramUsernameValidator);
        throw new IllegalArgumentException("Unsupported message type");
    }
}
