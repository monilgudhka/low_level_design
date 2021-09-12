package edu.monilgudhka.chat.model.content;

import edu.monilgudhka.chat.model.MessageContent;
import edu.monilgudhka.chat.model.MessageContentVisitor;

public class TextMessageContent implements MessageContent {

    private final String content;

    public TextMessageContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void visit(MessageContentVisitor visitor) {
        visitor.visitText(this);
    }
}
