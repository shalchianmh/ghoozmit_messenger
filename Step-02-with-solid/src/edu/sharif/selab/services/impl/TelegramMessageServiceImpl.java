package edu.sharif.selab.services.impl;

import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.MessageService;

public class TelegramMessageServiceImpl implements MessageService<TelegramMessage> {
    private final TelegramUsernameValidator usernameValidator;

    public TelegramMessageServiceImpl(TelegramUsernameValidator phoneNumberValidator) {
        this.usernameValidator = phoneNumberValidator;
    }

    @Override
    public void sendMessage(TelegramMessage telegramMessage) {
        if (usernameValidator.validateServiceAddress(telegramMessage.getSource())
                && usernameValidator.validateServiceAddress(telegramMessage.getTarget())) {

            System.out.println("Sending a SMS from " + telegramMessage.getSource() +
                    " to " +
                    telegramMessage.getTarget() +
                    " with content : " +
                    telegramMessage.getContent());

        } else {
            throw new IllegalArgumentException("Telegram Username is Not Correct!");
        }
    }
}
