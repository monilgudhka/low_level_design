package edu.monilgudhka.chat.model;

import lombok.Data;

import java.util.Date;
import java.util.Stack;

@Data
public class Message {

    private final Integer messageId;
    private final User messageFromUser;
    private final ChatRoom chatRoom;

    private final MessageContent message;
    private final Date createdAt;

    private final Stack<MessageStatusUpdate> messageStatusUpdates;
}