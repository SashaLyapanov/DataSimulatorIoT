package mops.lyapanov;

import mops.lyapanov.models.Message;
import mops.lyapanov.services.MessageGenerator;
import mops.lyapanov.services.SenderMessage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Message> messageList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        while(true) {
            messageList = MessageGenerator.generateMessages();
            SenderMessage.sendingMessagesToIoTController(messageList);
            Thread.sleep(10000);
        }
    }
}