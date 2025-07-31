package edu.sharif.selab.services;

import edu.sharif.selab.models.TelegramMessage;

public interface TelegramMessageService {
    public void sendTelegramMessage(TelegramMessage telegramMessage);
}
