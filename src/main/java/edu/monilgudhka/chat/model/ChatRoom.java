package edu.monilgudhka.chat.model;

import lombok.Data;

import java.util.Set;

@Data
public class ChatRoom {

    private final Integer roomId;
    private final String roomName;
    private final Set<User> users;
    private final ChatRoomType chatRoomType;
    private final User adminUser;

}
