package edu.monilgudhka.chat.model;

import lombok.Data;

import java.util.Date;

@Data
public class MessageStatusUpdate {
    private final MessageStatus status;
    private final Date updatedOn;
}
