package edu.monilgudhka.chat.model.content;

import edu.monilgudhka.chat.model.MessageContent;
import edu.monilgudhka.chat.model.MessageContentVisitor;
import lombok.Data;

import java.io.File;

@Data
public class VideoMessageContent implements MessageContent {

    private final String caption;
    private final File thumbnail;
    private final File video;


    @Override
    public void visit(MessageContentVisitor visitor) {
        visitor.visitVideo(this);
    }
}
