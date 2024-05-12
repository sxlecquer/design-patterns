package org.example.behavioral.cor.repository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, String> users;

    public UserRepository() {
        this.users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user", "password");
    }

    public boolean checkUsername(String username) {
        return users.containsKey(username);
    }

    public boolean checkPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
