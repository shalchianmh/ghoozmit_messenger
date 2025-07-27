package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body
    }
    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateTelegramUsername(telegramMessage.getSourceUsername())
        && validateTelegramUsername(telegramMessage.getTargetUsername())){

            System.out.println("Sending a SMS from " + telegramMessage.getSourceUsername() +
            " to " +
            telegramMessage.getTargetUsername() +
            " with content : " +
            telegramMessage.getContent());

        }else{
            throw new IllegalArgumentException("Telegram Username is Not Correct!");
        }
    }

    private boolean validateTelegramUsername(String username) {
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
