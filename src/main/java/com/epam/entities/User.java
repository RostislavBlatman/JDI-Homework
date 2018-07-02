package com.epam.entities;

import lombok.Value;

@Value
public class User {
    public static User PITER_CHAILOVSKI = new User("epam", "1234",
            "PITER CHAILOVSKI");
    private String login;
    private String password;
    private String userName;



}
