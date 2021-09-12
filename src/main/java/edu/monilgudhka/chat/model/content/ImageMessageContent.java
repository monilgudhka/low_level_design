package edu.monilgudhka.chat.model.content;

import edu.monilgudhka.chat.model.MessageContent;
import edu.monilgudhka.chat.model.MessageContentVisitor;
import lombok.Data;

import java.io.File;

@Data
public class ImageMessageContent implements MessageContent {

    private final String caption;
    private final File image;

    @Override
    public void visit(MessageContentVisitor visitor) {
        visitor.visitImage(this);
    }
}
