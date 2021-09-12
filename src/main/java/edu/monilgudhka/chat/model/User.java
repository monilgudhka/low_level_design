package edu.monilgudhka.chat.model;

import lombok.Data;

import java.io.File;

@Data
public class User {

    private final Integer userId;
    private final String userName;
    private final String emailId;
    private final String phoneNumber;

    private final File profilePic;
}
