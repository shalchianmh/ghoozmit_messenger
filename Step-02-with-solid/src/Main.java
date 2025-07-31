import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.*;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer = 0;
        do {
            Message message = null;
            String source;
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            userAnswer = scanner.nextInt();

            if (userAnswer == 0) {
                break;
            }

            switch (userAnswer) {
                case 1:
                    SmsMessage smsMessage = new SmsMessage();
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    smsMessage.setSourcePhoneNumber(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    smsMessage.setTargetPhoneNumber(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next(".*$");
                    smsMessage.setContent(content);
                    message = smsMessage;
                    break;
                case 2:
                    EmailMessage emailMessage = new EmailMessage();
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    emailMessage.setSourceEmailAddress(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    emailMessage.setTargetEmailAddress(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    emailMessage.setContent(content);
                    message = emailMessage;
                    break;
                case 3:
                    TelegramMessage telegramMessage = new TelegramMessage();
                    System.out.print("Enter source username : ");
                    source = scanner.next();
                    telegramMessage.setSourceUsername(source);
                    System.out.print("Enter target username : ");
                    target = scanner.next();
                    telegramMessage.setTargetUsername(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    telegramMessage.setContent(content);
                    message = telegramMessage;
                    break;
            }

            if (message instanceof SmsMessage) {
                SmsMessageService messageService = new SmsMessageServiceImpl();
                messageService.sendSmsMessage((SmsMessage) message);
            } else if (message instanceof EmailMessage) {
                EmailMessageService messageService = new EmailMessageServiceImpl();
                messageService.sendEmailMessage((EmailMessage) message);
            } else if (message instanceof TelegramMessage) {
                TelegramMessageService messageService = new TelegramMessageServiceImpl();
                messageService.sendTelegramMessage((TelegramMessage) message);
            }

        } while (true);
    }
}