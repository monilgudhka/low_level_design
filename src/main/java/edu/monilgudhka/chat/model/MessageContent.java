package edu.monilgudhka.chat.model;

public interface MessageContent {

    void visit(MessageContentVisitor visitor);
}
