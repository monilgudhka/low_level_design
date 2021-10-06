package edu.monilgudhka.rental;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String emailId;
    private String phoneNumber;
    private Address address;
    private UserStatus status;
}
