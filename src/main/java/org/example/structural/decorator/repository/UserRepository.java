package org.example.structural.decorator.repository;

public class UserRepository {
    public String getMailByUsername(String username) {
        return username + "@mail";
    }

    public String getPhoneNumberByUsername(String username) {
        return username + "@phone";
    }

    public String getFacebookByUsername(String username) {
        return username + "@facebook";
    }
}
