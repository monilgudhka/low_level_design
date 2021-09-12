package edu.monilgudhka.chat.model;

import edu.monilgudhka.chat.model.content.ImageMessageContent;
import edu.monilgudhka.chat.model.content.TextMessageContent;
import edu.monilgudhka.chat.model.content.VideoMessageContent;

/*

In Android application of Whatsapp.
There can be 3 classes that will implement this interface based on the processing of Messages.
1. ChatWindowMessageContentVisitor - to display messages in the application
2. NotificationMessageContentVisitor - to display messages in the notification
3. BackupMessageContentVisitor - to take backup of the messages

 */
public interface MessageContentVisitor {

    void visitText(TextMessageContent textMessageContent);

    void visitVideo(VideoMessageContent videoMessageContent);

    void visitImage(ImageMessageContent imageMessageContent);

}
